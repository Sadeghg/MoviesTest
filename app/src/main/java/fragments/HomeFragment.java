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


public class HomeFragment extends Fragment {

    private static final String TAG = "HomeFragment";

    private static final int NMU_COLUMNS = 2;

    private RecyclerView mRecyclerView;
//    private RecyclerView mRecyclerView2;

    private ArrayList<Movies> moviesArrayList = new ArrayList<>();

    private ArrayList<Movies> mMatches = new ArrayList<>();
    private MoviesRecyclerViewAdapter moviesRecyclerViewAdapter;
    private ArrayList<DummyPics> mMatches2 = new ArrayList<>();
    private HorizontalRecyclerviewAdapter horizontalRecyclerviewAdapter;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Log.d(TAG, "onCreateView: started.");
        mRecyclerView = view.findViewById(R.id.recycler_view);
//        mRecyclerView2 =view.findViewById(R.id.recycler_view_horizontal);


        findmatches();

        initializeRecyclerView();

        return view;


    }

    private void findmatches() {
        DummyMoviesList movies = new DummyMoviesList();
        DummyPicList picList = new DummyPicList();

        if (mMatches != null && mMatches2 != null) {
            mMatches.clear();
            mMatches2.clear();
        }
        for (Movies movies1 : movies.MOVIES){
            mMatches.add(movies1);
        }
        for (DummyPics dummyPics : picList.PICS){
            mMatches2.add(dummyPics);
        }
    }

    private void initializeRecyclerView(){
        Log.d(TAG, "initializeRecyclerView: initializing RecyclerView");
//        horizontalRecyclerviewAdapter = new HorizontalRecyclerviewAdapter(mMatches2, getActivity());
//        mRecyclerView2.setAdapter(horizontalRecyclerviewAdapter);
//        mRecyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        moviesRecyclerViewAdapter = new MoviesRecyclerViewAdapter(mMatches, getActivity());
        mRecyclerView.setAdapter(moviesRecyclerViewAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


    }
}
