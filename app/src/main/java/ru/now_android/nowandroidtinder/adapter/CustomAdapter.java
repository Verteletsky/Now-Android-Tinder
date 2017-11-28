package ru.now_android.nowandroidtinder.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.athbk.avatarview.TinderRecyclerView;
import com.athbk.avatarview.adapter.ItemVH;
import com.athbk.avatarview.adapter.TinderRVAdapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import ru.now_android.nowandroidtinder.R;
import ru.now_android.nowandroidtinder.model.Item;
import ru.now_android.nowandroidtinder.utils.IFinishDragAndDrop;

/**
 * Created by Vendetta on 28.11.2017.
 */

public class CustomAdapter extends TinderRVAdapter<Item, CustomAdapter.CustomViewHolder> {

    private List<Item> listData;
    private Context context;
    private IFinishDragAndDrop finishDragAndDrop;

    public void setFinishDragAndDrop(IFinishDragAndDrop finishDragAndDrop) {
        this.finishDragAndDrop = finishDragAndDrop;
    }

    public CustomAdapter(List<Item> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }

    @Override
    protected List<Item> getListItem() {
        return listData;
    }

    @Override
    protected CustomViewHolder onCreateItemViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, viewGroup, false);
        return new CustomViewHolder(view);
    }

    @Override
    protected void onBindItemViewHolder(CustomViewHolder vh, int i) {
        Picasso.with(context).load(listData.get(i).getUrlImg()).into(vh.imageView);
        vh.textView.setTextColor(listData.get(i).getId());
    }

    class CustomViewHolder extends ItemVH {

        FrameLayout frameLayout;
        ImageView imageView;
        TextView textView;

        public CustomViewHolder(View itemView) {
            super(itemView);
            frameLayout = itemView.findViewById(R.id.layout);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.txt);
        }

        @Override
        public void onItemSelected() {
            super.onItemSelected();
            frameLayout.setAlpha(0.5f);
        }

        @Override
        public void onItemClear() {
            super.onItemClear();
            frameLayout.setAlpha(1f);
            if (finishDragAndDrop != null)
                finishDragAndDrop.updateListData((ArrayList<Item>) getListItem());
        }
    }
}
