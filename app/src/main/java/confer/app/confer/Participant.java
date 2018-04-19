package confer.app.confer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Participant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participant);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);

        //Initialize android recyclerview
        RecyclerView mRecyclerView = findViewById(R.id.rv0);

        //initializr android linearlayout manager
        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(Participant.this,
                LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        //Divider to draw a line to separate
        mRecyclerView.addItemDecoration(new DividerItemDecoration(Participant.this,
                DividerItemDecoration.VERTICAL));

        //


        //Floating button
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
