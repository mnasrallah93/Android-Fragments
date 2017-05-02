package mn.proj2bm;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import mn.proj2bm.dummy.DummyContent;

/**
 * A fragment representing a single professor detail screen.
 * This fragment is either contained in a {@link professorListActivity}
 * in two-pane mode (on tablets) or a {@link professorDetailActivity}
 * on handsets.
 */
public class professorDetailFragment extends Fragment {

    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public professorDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle("Professor Details");           //sets title of professor name in details

            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.professor_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.professor_detail)).setText(mItem.details);


            Activity activity = this.getActivity();
            ImageView professorPic = (ImageView) activity.findViewById(R.id.imageView);
            TextView professorName = (TextView) activity.findViewById(R.id.professorDetail_NameTitle);


            if (mItem.content == "John Baugh") {                          //sets images to appropriate professors
                professorPic.setImageResource(R.drawable.john);//keeps it all set in landscape mode too
                professorName.setText("John Baugh");
            } else if (mItem.content == "Kiumi Akingbehir") {
                professorPic.setImageResource(R.drawable.kiumi);
                professorName.setText("Kiumi Akingbehir");
            } else if (mItem.content == "Bruce Elenbogen") {
                professorPic.setImageResource(R.drawable.bruce);
                professorName.setText("Bruce Elenbogen");
            } else if (mItem.content == "Jinhua Guo") {
                professorPic.setImageResource(R.drawable.jinhua);
                professorName.setText("Jinhua Guo");
            } else if (mItem.content == "Maroune Kessentini") {
                professorPic.setImageResource(R.drawable.maroune);
                professorName.setText("Maroune Kessentini");

            }

            RatingBar ratingBar = (RatingBar) rootView.findViewById(R.id.profRatingBar);        //THIS: commented code: dynamic fragments' rating bar save/load is broken

            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(rootView.getContext());

            Float rating = preferences.getFloat(mItem.details,0f);


//            ratingBar.setRating(rating); // code breaks here

//            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
//                @Override
//                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
//                    SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(rootView.getContext());
//                    SharedPreferences.Editor editor = preferences.edit();
//                    editor.putFloat(mItem.details,rating);
//                    editor.apply();
//                }
//            });


        }

        return rootView;
    }
}
