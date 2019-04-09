package fragments;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.moviestest.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import models.Movies;

public class MoviesRecyclerViewAdapter extends RecyclerView.Adapter<MoviesRecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "fragments.MoviesRecyclerViewAdapter";

    private ArrayList<Movies> mMovies;
    private Context mContext;


    public MoviesRecyclerViewAdapter(ArrayList<Movies> mMovies, Context mContext) {
        this.mMovies = mMovies;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_main_feeed, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background);
        Glide.with(mContext)
                .asBitmap()
                .load(mMovies.get(position).getMovie_cover())
                .apply(requestOptions)
                .into(holder.cover);

        Glide.with(mContext)
                .asBitmap()
                .load(mMovies.get(position).getMovie_publisher())
                .apply(requestOptions)
                .into(holder.publisher);



        holder.movie_name.setText(mMovies.get(position).getMovie_name());
        holder.movie_genre.setText(mMovies.get(position).getMovie_genre());
        holder.movie_likes.setText(mMovies.get(position).getMovie_likes());
        holder.movie_year.setText(mMovies.get(position).getMovie_year());


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on: " + mMovies.get(position).getMovie_name());
            }
        });

        holder.comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Comment part not ready yet", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return mMovies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView cover;
        CircleImageView publisher;
        TextView movie_name;
        TextView movie_genre;
        TextView movie_year;
        TextView movie_likes;
        CardView cardView;
        Button comment;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            publisher = itemView.findViewById(R.id.movie_publisher);
            cover = itemView.findViewById(R.id.movie_cover);
            movie_name = itemView.findViewById(R.id.movie_name);
            movie_genre = itemView.findViewById(R.id.movie_location);
            movie_year = itemView.findViewById(R.id.movie_time_published);
            movie_likes = itemView.findViewById(R.id.movie_likes);
            cardView = itemView.findViewById(R.id.card_view);
            comment= itemView.findViewById(R.id.movie_comments);

        }
    }
}


