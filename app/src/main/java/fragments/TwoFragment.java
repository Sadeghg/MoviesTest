package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.moviestest.R;

import java.util.ArrayList;

import models.DummyPics;
import models.Movies;


public class TwoFragment extends Fragment {

    private static final String TAG = "HomeFragment";
    private RecyclerView mRecyclerView2;


    private ArrayList<DummyPics> mMatches2 = new ArrayList<>();
    private HorizontalRecyclerviewAdapter horizontalRecyclerviewAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        Log.d(TAG, "onCreateView: started.");

        mRecyclerView2 = view.findViewById(R.id.recycler_view_horizontal);

        findmatches();

        initializeRecyclerView();

        return view;
    }

    private void findmatches() {
        DummyMoviesList movies = new DummyMoviesList();
        DummyPicList picList = new DummyPicList();

        if ( mMatches2 != null) {
            mMatches2.clear();
        }

        for (DummyPics dummyPics : picList.PICS){
            mMatches2.add(dummyPics);
        }
    }

    private void initializeRecyclerView(){
        Log.d(TAG, "initializeRecyclerView: initializing RecyclerView");
        horizontalRecyclerviewAdapter = new HorizontalRecyclerviewAdapter(mMatches2, getActivity());
        mRecyclerView2.setAdapter(horizontalRecyclerviewAdapter);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView2.setLayoutManager(manager);


    }
}
