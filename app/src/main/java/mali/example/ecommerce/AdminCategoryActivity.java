package mali.example.ecommerce;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity
{
    private ImageView seeds, plants, fertilizers;
;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);


        seeds = (ImageView) findViewById(R.id.S_seeds);
        plants= (ImageView) findViewById(R.id.S_plants);
        fertilizers = (ImageView) findViewById(R.id.S_fertilizers);




        seeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Seed Category");
                startActivity(intent);
            }
        });


        plants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Plant Category");
                startActivity(intent);
            }
        });


        fertilizers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Fertilizer Category");
                startActivity(intent);
            }
        });


    }
}