package mali.example.ecommerce;

import android.view.View;

public interface ItemClickListner {
    void onClick(View view, int position, boolean isLongClick);
}
