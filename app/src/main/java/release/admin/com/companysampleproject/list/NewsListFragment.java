package release.admin.com.companysampleproject.list;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import release.admin.com.companysampleproject.R;

public class NewsListFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View mRoot = null;
        recyclerView = (RecyclerView) mRoot.findViewById(R.id.news_list_recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        //recyclerView.setAdapter(new NewsListRecyclerAdapter(getDummyMessages(), getActivity(), this));
        return mRoot;
    }
}
