package com.geektech.dz35;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private ImageView picture;
    private TextView name, phone;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        picture = itemView.findViewById(R.id.iv_picture);
        name = itemView.findViewById(R.id.tv_name);
        phone = itemView.findViewById(R.id.tv_phone);
    }

    public void onBind(Model model) {
        picture.setImageResource(model.getPicture());
        name.setText(model.getName());
        phone.setText(String.valueOf(model.getPhone()));

    }
}
