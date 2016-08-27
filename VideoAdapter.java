package uvdos.uvdos;

/**
 * Created by Keval Rathod on 8/27/2016.
 */

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.provider.MediaStore;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.MyViewHolder> {

    private List<Video> videoList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView videoName,videoSize;
        ImageView thumbNail;

        public MyViewHolder(View view) {
            super(view);
            videoName = (TextView) view.findViewById(R.id.name);
            videoSize = (TextView) view.findViewById(R.id.size);
            thumbNail = (ImageView)view.findViewById(R.id.thumbNail);
        }
    }


    public VideoAdapter(List<Video> videoList) {
        this.videoList= videoList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.video_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Video video = videoList.get(position);
        holder.videoName.setText(video.getDisplayName());
        holder.videoSize.setText(video.getSize());


        Bitmap thumb = ThumbnailUtils.createVideoThumbnail(video.getData(),
                MediaStore.Images.Thumbnails.MINI_KIND);

        holder.thumbNail.setImageBitmap(thumb);
    }

    @Override
    public int getItemCount() {
        return videoList.size();
    }
}