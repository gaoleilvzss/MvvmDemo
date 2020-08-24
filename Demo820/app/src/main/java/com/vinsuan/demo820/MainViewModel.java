package com.vinsuan.demo820;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ObservableShort;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.vinsuan.demo820.adapter.NetWorkAdapter;
import com.vinsuan.demo820.adapter.RVItemAdapter;
import com.vinsuan.demo820.model.ArticleModel;
import com.vinsuan.demo820.model.RVItemModel;
import com.vinsuan.demo820.ui.ArticleDetailActivity;
import com.vinsuan.lib_base.adapter.edittext.SimpleTextWatcher;
import com.vinsuan.lib_base.base.BaseViewModel;
import com.vinsuan.lib_base.utils.AppGlobal;
import com.vinsuan.lib_network.response.ApiResponse;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * create by gaolei
 * on 2020/8/21
 */
public class MainViewModel extends BaseViewModel<MainRepository> {
    public String other_url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598020131005&di=be3eb29b8f904dcf85c51c3501434a64&imgtype=0&src=http%3A%2F%2Fa2.att.hudong.com%2F36%2F48%2F19300001357258133412489354717.jpg";
    public String url = "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3892521478,1695688217&fm=26&gp=0.jpg";

    public ObservableField<String> text = new ObservableField<>();
    public ObservableField<String> observableField_url = new ObservableField<>();

    public ObservableField<String> et_string = new ObservableField<>();
    public ObservableField<String> et_callback_string = new ObservableField<>();
    private PageInfo pageInfo = new PageInfo();

    class PageInfo {
        int page = 0;

        void nextPage() {
            page++;
        }

        void reset() {
            page = 0;
        }

        boolean isFirstPage() {
            return page == 0;
        }
    }

    @SuppressLint("CheckResult")
    public MainViewModel(MainRepository repository) {
        super(repository);

        text.set("Click Me");
        observableField_url.set(url);
        et_callback_string.set("暂时为空");

        for (int i = 0; i < 10; i++) {
            RVItemModel model = new RVItemModel();
            model.age = "12";
            model.avatar = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598023311719&di=7c454f9822d65076a08c86e94be39eaf&imgtype=0&src=http%3A%2F%2Fcdn.duitang.com%2Fuploads%2Fitem%2F201309%2F26%2F20130926095128_SiPMh.jpeg";
            model.gender = "男";
            model.name = "高磊";
            observableList.add(model);
        }
        initLoadMore();
        request();


    }

    private void initLoadMore() {
        netWorkAdapter.getLoadMoreModule().setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                loadMore();
            }
        });
        netWorkAdapter.getLoadMoreModule().setAutoLoadMore(true);
        //当自动加载开启，同时数据不满一屏时，是否继续执行自动加载更多(默认为true)
        netWorkAdapter.getLoadMoreModule().setEnableLoadMoreIfNotFullPage(false);

    }

    private void loadMore() {
        request();
    }

    /**
     * 请求数据
     */
    @SuppressLint("CheckResult")
    private void request() {
        model.refresh(String.valueOf(pageInfo.page)).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(articleModelApiResponse -> {
            netWorkAdapter.getLoadMoreModule().setEnableLoadMore(true);
            articleModels.addAll(articleModelApiResponse.data.getDatas());
            if (pageInfo.isFirstPage()) {
                //如果是加载的第一页数据，用 setData()
                netWorkAdapter.setList(articleModelApiResponse.data.getDatas());
            } else {
                //不是第一页，则用add
                netWorkAdapter.addData(articleModelApiResponse.data.getDatas());
            }

            if (articleModels.size() < 20) {
                //如果不够一页,显示没有更多数据布局
                netWorkAdapter.getLoadMoreModule().loadMoreEnd();
            } else {
                netWorkAdapter.getLoadMoreModule().loadMoreComplete();
            }
            // page加一
            pageInfo.nextPage();
        });
    }

    public View.OnClickListener listener = v -> {
        if (TextUtils.equals(text.get(), "gaolei")) {
            text.set("Click Me");
            observableField_url.set(url);
        } else {
            text.set("gaolei");
            observableField_url.set(other_url);
        }
    };

    public TextWatcher textWatcher = new SimpleTextWatcher() {
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (s.length() == 0) {
                et_callback_string.set("暂时为空");
                return;
            }
            et_callback_string.set(s.toString());
        }
    };

    public ObservableList<RVItemModel> observableList = new ObservableArrayList<>();
    public ObservableList<ArticleModel.DatasBean> articleModels = new ObservableArrayList<>();

    public LinearLayoutManager linearLayoutManager = new LinearLayoutManager(AppGlobal.get());
    public LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(AppGlobal.get());
    public RVItemAdapter rvItemAdapter = new RVItemAdapter(observableList);

    public NetWorkAdapter netWorkAdapter = new NetWorkAdapter(articleModels);

    public OnItemClickListener newWorkClickListener = new OnItemClickListener() {
        @Override
        public void onItemClick(@NonNull BaseQuickAdapter<?, ?> adapter, @NonNull View view, int position) {
            Toast.makeText(AppGlobal.get(), articleModels.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            Bundle bundle = new Bundle();
            bundle.putString("link",articleModels.get(position).getLink());
            startActivity(ArticleDetailActivity.class,bundle);
        }
    };
    public OnItemClickListener adapterListener = (adapter, view, position) -> Toast.makeText(AppGlobal.get(), "position = " + position + ",name = " + observableList.get(position).name, Toast.LENGTH_SHORT).show();
}
