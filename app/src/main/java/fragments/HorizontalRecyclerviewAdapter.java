package fragments;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.moviestest.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import models.DummyPics;
import models.Movies;

public class HorizontalRecyclerviewAdapter extends RecyclerView.Adapter<HorizontalRecyclerviewAdapter.ViewHolder> {

    private static final String TAG = "fragments.MoviesRecyclerViewAdapter";

    private ArrayList<DummyPics> mDummyPics;
    private Context mContext;


    public HorizontalRecyclerviewAdapter(ArrayList<DummyPics> mDummyPics, Context mContext) {
        this.mDummyPics = mDummyPics;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public HorizontalRecyclerviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.horizantal_recyclerview, viewGroup, false);
        HorizontalRecyclerviewAdapter.ViewHolder holder = new HorizontalRecyclerviewAdapter.ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalRecyclerviewAdapter.ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background);
        Glide.with(mContext)
                .asBitmap()
                .load(mDummyPics.get(position).getMovie_cover())
                .apply(requestOptions)
                .into(holder.publisher);





    }

    @Override
    public int getItemCount() {
        return mDummyPics.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView publisher;
        CardView cardView;





        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            publisher = itemView.findViewById(R.id.circle_image_view);
            cardView = itemView.findViewById(R.id.card_view);

        }
    }
}
