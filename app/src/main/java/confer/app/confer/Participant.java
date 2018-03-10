package confer.app.confer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Participant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participant);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).
                // setAction("Action", null).show();
                goToComposeMail();
            }
        });
    }

    void goToComposeMail() {
        Intent intent = new Intent(this, ComposeMailActivity.class);
        startActivity(intent);
    }

    //RecyclerView Code for recyclerview present in participant class
    /*
    private List<TextView> items;
    private int itemLayout;

    public Participant(List<TextView> items, int itemLayout){
        this.items = items;
        this.itemLayout = itemLayout;
    }

    //@Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new ViewHolder(v);
        //return null;
    }

    //@Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TextView item = items.get(position);
        holder.text.setText(item.getText());
    }

    //@Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        //public ImageView image;
        public TextView text;
        public ViewHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.text);
        }
    }
    */
}
