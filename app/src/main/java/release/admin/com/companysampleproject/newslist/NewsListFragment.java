package release.admin.com.companysampleproject.newslist;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import release.admin.com.companysampleproject.R;

public class NewsListFragment extends Fragment  implements NewsListContract.NewsView,
        NewsListRecyclerAdapter.OnAdpterItemClickListner {

    private RecyclerView mRecyclerView;
    private NewsListContract.Presenter mPresenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mPresenter = new NewsListPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View mRoot = inflater.inflate(R.layout.news_list_fragment, container, false);
        mRecyclerView = (RecyclerView) mRoot.findViewById(R.id.news_list_recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        //mRecyclerView.setAdapter(new NewsListRecyclerAdapter(getDummyMessages(), getActivity(), this));
        mPresenter.fetchData();
        return mRoot;
    }

    @Override
    public void refreshList(NewsParentModel newsParentModel) {
        //update the adapter
    }

    @Override
    public void showProgressBar() {

    }

    @Override
    public void hideProgressBar() {

    }

    @Override
    public void showToast(String message) {

    }

    @Override
    public void onEmojiClick(View anchorView) {

    }
}
