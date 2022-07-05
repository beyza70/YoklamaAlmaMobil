package com.example.javalogin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

// FirebaseRecyclerAdapter is a class provided by
// FirebaseUI. it provides functions to bind, adapt and show
// database contents in a Recycler View
public class personAdapter extends FirebaseRecyclerAdapter<Person, personAdapter.personsViewholder> {

    public personAdapter(
            @NonNull FirebaseRecyclerOptions<Person> options)
    {
        super(options);
    }

    // Function to bind the view in Card view(here
    // "person.xml") iwth data in
    // model class(here "person.class")
    @Override
    protected void
    onBindViewHolder(@NonNull personsViewholder holder,
                     int position, @NonNull Person model)
    {

        // Add firstname from model class (here
        // "person.class")to appropriate view in Card
        // view (here "person.xml")
        holder.bolumadı2.setText("Bilgisayar Mühendisliği");

        //MODEL.GET
        // Add lastname from model class (here
        // "person.class")to appropriate view in Card
        // view (here "person.xml")
        holder.dersadı2.setText("Veri Madenciliği");

        // Add age from model class (here
        // "person.class")to appropriate view in Card
        // view (here "person.xml")
        holder.fakulteadı2.setText("Mühendislik Fakültesi");

        holder.ogrid2.setText("JeEFAsGscCX0Gvc5m8WzycFeVE33");
        holder.okuladı2.setText("KMU");
        holder.adsoyad2.setText("Beyzanur Kale");
        holder.numara2.setText("181312020");
        holder.sınıf2.setText("4.Sınıf");
        holder.foto2.setText("https://yeni-8164e-default-rtdb.firebaseio.com");
    }

    // Function to tell the class about the Card view (here
    // "person.xml")in
    // which the data will be shown
    @NonNull
    @Override
    public personsViewholder
    onCreateViewHolder(@NonNull ViewGroup parent,
                       int viewType)
    {
        View view
                = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.person3, parent, false);
        return new personAdapter.personsViewholder(view);
    }

    // Sub Class to create references of the views in Crad
    // view (here "person.xml")
    class personsViewholder
            extends RecyclerView.ViewHolder {
        TextView bolumadı2,dersadı2,fakulteadı2,ogrid2,okuladı2,adsoyad2,numara2,sınıf2,foto2;
        public personsViewholder(@NonNull View itemView)
        {
            super(itemView);

            bolumadı2 = itemView.findViewById(R.id.bolumadı2);
            dersadı2 = itemView.findViewById(R.id.dersadı2);
            fakulteadı2 = itemView.findViewById(R.id.fakulteadı2);
            ogrid2 = itemView.findViewById(R.id.ogrid2);
            okuladı2 = itemView.findViewById(R.id.okuladı2);
            adsoyad2 = itemView.findViewById(R.id.adsoyad2);
            numara2 = itemView.findViewById(R.id.numara2);
            sınıf2 = itemView.findViewById(R.id.sınıf2);
            foto2 = itemView.findViewById(R.id.foto2);

        }
    }
}
