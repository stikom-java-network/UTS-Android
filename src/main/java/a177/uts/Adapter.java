package a177.uts;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mhs on 20/11/2019.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.CardViewViewHolder>{

    private Context mContext;
    private ArrayList<Item> list_item = new ArrayList<>();

    public Adapter(Context mContext, ArrayList<Item> list_superheroes) {
        this.mContext = mContext;
        this.list_item = list_superheroes;
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {
        Item m = list_item.get(position);

        holder.imgPhoto.setImageResource(Integer.valueOf(m.getPicture()));
        holder.Title.setText(String.valueOf(m.getTitle()));
        holder.Price.setText(String.valueOf(m.getPrice()));
        holder.Qty.setText(String.valueOf(m.getQty()));
        holder.subTotal.setText(String.valueOf(m.subTotal(m.getPrice(), m.getQty())));
    }

    @Override
    public int getItemCount() {
        return list_item.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView Title, Price, Qty, subTotal;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            Title = itemView.findViewById(R.id.tv_item_title);
            Price = itemView.findViewById(R.id.tv_item_price);
            Qty = itemView.findViewById(R.id.tv_item_qty);
            subTotal = itemView.findViewById(R.id.tv_item_subTotal);
        }
    }
}
