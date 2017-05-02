package mn.proj2bm.dummy;

import android.app.Activity;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mn.proj2bm.R;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 5;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {             //main screen professor names

        switch (position) {
            case 1:
                return new DummyItem(String.valueOf(position), "John Baugh", makeDetails(position));

            case 2:
                return new DummyItem(String.valueOf(position), "Kiumi Akingbehir", makeDetails(position));

            case 3:
                return new DummyItem(String.valueOf(position), "Bruce Elenbogen", makeDetails(position));

            case 4:
                return new DummyItem(String.valueOf(position), "Jinhua Guo", makeDetails(position));

            case 5:
                return new DummyItem(String.valueOf(position), "Maroune Kessentini", makeDetails(position));

        }
    return new DummyItem(String.valueOf(position), "NULL" + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();


        if (position == 1)                                      //bios are printed out here
        {

            builder.append("- C#\n" +
                     "- ASP .NET (Web Forms and MVC)\n" +
                     "- Java I\n" +
                     "- Java II\n" +
                     "- Data Structures in Java\n" +
                     "- Visual Basic\n" +
                     "- C++\n" +
                     "- Android Application Development\n" +
                     "- System Support\n" +
                     "- Microsoft Office (Personal Computer Productivity Tools)\n" +
                     "- Game Design and Implementation I");
        }

        else if (position == 2)
        {
            builder.append(
                    "*Courses: \n\n" +
                    "- CIS 150 Computer Science\n" +
                    "- CIS 310 Computer Organization\n" +
                    "- CIS 350 Data Structures and Algorithm Analysis\n" +
                    "- CIS 375 Software Engineering I\n" +
                    "- CIS 376 Software Engineering II\n" +
                    "- CIS/IMSE 450 Operating Systems\n" +
                    "- CIS 4951/52/61/62 Design Seminar\n" +
                    "- CIS 510 Computer Interfacing\n" +
                    "- CIS 535 Pervasive Computing\n" +
                    "- CIS/IMSE 553 Software Engineering\n" +
                    "- CIS 565 Software Quality Assurance\n" +
                    "- CIS/ECE 578 Advanced Operating System\n" +
                    "- IMSE 532 Information for Manufacturing");
        }

        else if (position == 3)
        {
            builder.append("- Associate Professor from 1982 to Present.\n" +
                    "- Master of Science Degree from U of M, in Computer Science\n" +
                    "- Ph.D in Applied Mathematics from Northwestern University\n" +
                    "- Likes Cats\n" +
                    "- Makes fun of his students' intelligence");
        }

        else if (position == 4)
        {
            builder.append("*Grants*\n\n" +
                    "- NSF Grant: co-PI, “- EDU: Collaborative: Enhancing Pervasive and Mobile Computing Security Education with Research Integration,” US National Science Foundation, 2014–2016 (PI: D. Ma).\n" +
                    "- Amazon: PI, “Amazon AWS in Education Coursework Grant award,” 2012-2015, in AWS credits.\\n\" +\n" +
                    "- NSF Grant: PI, “Acquisition of Instruments for Mobile Computing Research in the Context of Automotive Applications,” US National Science Foundation, 2005–2010 (co-PIs: H. Abdu, K. Akingbehin, N. Patel, W. Xiang, and Q. Zhu; Senior Person: P. Richardson).\n" +
                    "- Chrysler Research Grant: PI, “Developing a Delay Tolerant Networking Convergence Layer for Vehicular Internet,” Chrysler LLC/Brightstar Corp, 2008 – 2009.\n" +
                    "- IAVS Grant: PI, “Optimizing Traffic Flow Management, Topology Control, and Virtual Machine Placement in Cloud Data Centers,” 2014 (co-PI: D. Ma)\n" +
                    "- OVPR: PI, “Increasing Broadcast Reliability in Vehicular Ad Hoc Networks,” 2006 – 2007.\n" +
                    "- Rackham: PI, “Development of Routing Protocols for Vehicular Ad hoc Networks,” 2004 – 2005.\n" +
                    "- CEEP: PI, “Secure and Privacy-Preserving Inter-Vehicle Communication Framework,” 2006 – 2008.");
        }

       else if (position == 5)
        {
            builder.append("Dr. Marouane Kessentini is an assistant professor in Software engineering at the University of Michigan, Dearborn campus.\n- " +
                    "Received his PhD end of 2011 from University of Montreal.\n- He is the founding director of the Search-based software engineering" +
                    " research lab in Michigan including now 1 post-doc, 7 PhD students and 8 master students.\n" +
                    "- He has several collaborations with different industrial companies on studying software\n" +
                    "engineering problems by artificial intelligence techniques.\n- Dr. Kessentini has three" +
                    "best paper awards and he also nominated for the best dissertation award in 2011 from" +
                    "University of Montreal.\n- Very active in the area of software refactoring with " +
                    "around 50 papers published in top Software Engineering journals and conferences" +
                    " including TSE, TOSEM, etc. \n- Dr. Kessentini served as a program comittee member " +
                    "and chair of several software engineering conferences. \n- He is also the founder " +
                    "of the North American SBSE conference that will be held in Michigan on February 2015 (funded by NSF).");
        }

        return builder.toString();
    }



    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
