package a177.uts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import static a177.uts.R.id.list_item;
import static a177.uts.R.id.rv_item;

public class UTS extends AppCompatActivity {

    RecyclerView rv_item;
    ArrayList<Item> list_item = new ArrayList<>();
    Adapter Adapter;
    TextView Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uts);
        showRecyclerCard();
        Total = (TextView)findViewById(R.id.tv_item);
        Total.setText(Integer.toString(list_item.size()));


    }

    private void showRecyclerCard(){
        rv_item = (RecyclerView)findViewById(R.id.rv_item);
        Adapter = new Adapter(UTS.this, list_item);

        prepareData();

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(UTS.this);
        rv_item.setLayoutManager(mLayoutManager);
        rv_item.setAdapter(Adapter);
        Adapter.notifyDataSetChanged();
    }

    private void prepareData() {

        Item s = new Item();
        s.setPicture(R.drawable.item1);
        s.setTitle("Pencil");
        s.setPrice(1.25);
        s.setQty(12);
        s.subTotal(s.getPrice(), s.getQty());
        list_item.add(s);

        s = new Item();
        s.setPicture(R.drawable.item2);
        s.setTitle("Ruler");
        s.setPrice(2.2);
        s.setQty(5);
        s.subTotal(s.getPrice(), s.getQty());
        list_item.add(s);

        s = new Item();
        s.setPicture(R.drawable.item3);
        s.setTitle("Clip");
        s.setPrice(0.7);
        s.setQty(20);
        s.subTotal(s.getPrice(), s.getQty());
        list_item.add(s);

        s = new Item();
        s.setPicture(R.drawable.item4);
        s.setTitle("Chalk");
        s.setPrice(3.0);
        s.setQty(4);
        s.subTotal(s.getPrice(), s.getQty());
        list_item.add(s);

        s = new Item();
        s.setPicture(R.drawable.item5);
        s.setTitle("Book");
        s.setPrice(2.5);
        s.setQty(10);
        s.subTotal(s.getPrice(), s.getQty());
        list_item.add(s);


    }
}
