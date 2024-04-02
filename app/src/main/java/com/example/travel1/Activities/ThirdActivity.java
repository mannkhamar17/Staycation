package com.example.travel1.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.travel1.Adapters.CategoryAdapter;
import com.example.travel1.Adapters.PupolarAdapter;
import com.example.travel1.Domains.CategoryDomain;
import com.example.travel1.Domains.PopularDomain;
import com.example.travel1.R;

import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {
    ImageButton ib2;
    private RecyclerView.Adapter adapterPopular , adapterCat;
    private RecyclerView recyclerViewPopular,recyclerViewCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ib2 = findViewById(R.id.imagebutton);

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });

        initRecyclerView();

    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("Entire villa in Portal del Norte","Mexico","Located north of Monterrey, in Portal del Norte, with quick access to the Carretera Nuevo Laredo, in an area of large quintas." +
                "Built on a 1,500 m2 land, construction was completed just in April 2023. The guest house has more than 500 m2 of construction, 5 bedrooms, 4 full bathrooms and is decorated with high-quality furniture imported and with great interior design."
                ,2,true,4,"mexicoairbnb2",true,30000));




        items.add(new PopularDomain("Beachfront Sunset Villa w/ Staff & Infinity Pool","Thailand","Welcome to our serene beachfront villa in Koh Samui, perfect for families, " +
                "couples, and small groups seeking a peaceful retreat. With 5 bedrooms, each offering stunning ocean views," +
                " and a private saltwater infinity pool, it’s a haven of tranquility. Step directly onto the calm, pristine beach, " +
                "enjoy your morning coffee or beautiful sunsets from the rooftop, and be spoiled by the personalised service of our " +
                "dedicated staff. Our villa promises a luxurious, quiet escape, away from the party crowds.",1,true,5,"bnb2",true,41312));


        items.add(new PopularDomain("Dreamy Cliffside Bamboo Villa with Pool and View","Indonesia","Experiencing Avana Curve Bamboo Villa is creating memories to last a lifetime. " +
                "Overlooking Bali's best landscapes, The Curve Villa welcomes you with mesmerizing views. " +
                "Perched along a high cliff, The Curve Villa boasts views of Mount Agung Volcano to the left and the Indian Ocean to the right. " +
                "Situated below the villa is a gorgeous, expansive rice terrace valley with the Ayung river flowing through it. " +
                "All of Bali’s landscapes are summarized in this one open view from the Curve Villa.",3,true,4,"bnb3",true,26524));


        recyclerViewPopular=findViewById(R.id.view_pop);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterPopular = new PupolarAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);



//        ArrayList<CategoryDomain> catsList = new ArrayList<>();
//        catsList.add(new CategoryDomain("Beaches","cat1"));
//        catsList.add(new CategoryDomain("Camps","cat2"));
//        catsList.add(new CategoryDomain("Forest","cat3"));
//        catsList.add(new CategoryDomain("Dessert","cat4"));
//        catsList.add(new CategoryDomain("Mountain","cat5"));
//
//
//
//
//        recyclerViewCategory=findViewById(R.id.view_cat);
//        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
//        adapterCat = new CategoryAdapter(catsList);
//        recyclerViewCategory.setAdapter(adapterCat);





    }


}