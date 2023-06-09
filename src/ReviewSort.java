import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
class Review{
    private long id;
    private String reviewId;
    private String reviewFullText;
    private String reviewText;
    private int numLikes;
    private int numComments;
    private int numShares;
    private int rating;
    private String reviewCreatedOn;
    private String reviewCreatedOnDate;
    private long reviewCreatedOnTime;
    private String reviewerId;
    private String reviewerUrl;
    private String reviewerName;
    private String reviewerEmail;
    private String sourceType;
    private boolean isVerified;
    private String source;
    private String sourceName;
    private String sourceId;
    private String tags[];
    private boolean href;
    private boolean logoHref;
    private String photos[];

    public Review(){

    }

    public Review(long id, String reviewId, String reviewFullText, String reviewText,
                  int numLikes, int numComments, int numShares, int rating, String reviewCreatedOn,
                  String reviewCreatedOnDate, long reviewCreatedOnTime, String reviewerId,
                  String reviewerUrl, String reviewerName, String reviewerEmail, String sourceType,
                  boolean isVerified, String source, String sourceName, String sourceId, String[] tags,
                  boolean href, boolean logoHref, String[] photos) {
        this.id = id;
        this.reviewId = reviewId;
        this.reviewFullText = reviewFullText;
        this.reviewText = reviewText;
        this.numLikes = numLikes;
        this.numComments = numComments;
        this.numShares = numShares;
        this.rating = rating;
        this.reviewCreatedOn = reviewCreatedOn;
        this.reviewCreatedOnDate = reviewCreatedOnDate;
        this.reviewCreatedOnTime = reviewCreatedOnTime;
        this.reviewerId = reviewerId;
        this.reviewerUrl = reviewerUrl;
        this.reviewerName = reviewerName;
        this.reviewerEmail = reviewerEmail;
        this.sourceType = sourceType;
        this.isVerified = isVerified;
        this.source = source;
        this.sourceName = sourceName;
        this.sourceId = sourceId;
        this.tags = tags;
        this.href = href;
        this.logoHref = logoHref;
        this.photos = photos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewFullText() {
        return reviewFullText;
    }

    public void setReviewFullText(String reviewFullText) {
        this.reviewFullText = reviewFullText;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }

    public int getNumComments() {
        return numComments;
    }

    public void setNumComments(int numComments) {
        this.numComments = numComments;
    }

    public int getNumShares() {
        return numShares;
    }

    public void setNumShares(int numShares) {
        this.numShares = numShares;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReviewCreatedOn() {
        return reviewCreatedOn;
    }

    public void setReviewCreatedOn(String reviewCreatedOn) {
        this.reviewCreatedOn = reviewCreatedOn;
    }

    public String getReviewCreatedOnDate() {
        return reviewCreatedOnDate;
    }

    public void setReviewCreatedOnDate(String reviewCreatedOnDate) {
        this.reviewCreatedOnDate = reviewCreatedOnDate;
    }

    public long getReviewCreatedOnTime() {
        return reviewCreatedOnTime;
    }

    public void setReviewCreatedOnTime(long reviewCreatedOnTime) {
        this.reviewCreatedOnTime = reviewCreatedOnTime;
    }

    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getReviewerUrl() {
        return reviewerUrl;
    }

    public void setReviewerUrl(String reviewerUrl) {
        this.reviewerUrl = reviewerUrl;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getReviewerEmail() {
        return reviewerEmail;
    }

    public void setReviewerEmail(String reviewerEmail) {
        this.reviewerEmail = reviewerEmail;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public boolean isHref() {
        return href;
    }

    public void setHref(boolean href) {
        this.href = href;
    }

    public boolean isLogoHref() {
        return logoHref;
    }

    public void setLogoHref(boolean logoHref) {
        this.logoHref = logoHref;
    }

    public String[] getPhotos() {
        return photos;
    }

    public void setPhotos(String[] photos) {
        this.photos = photos;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", reviewId='" + reviewId + '\'' +
                ", reviewFullText='" + reviewFullText + '\'' +
                ", reviewText='" + reviewText + '\'' +
                ", numLikes=" + numLikes +
                ", numComments=" + numComments +
                ", numShares=" + numShares +
                ", rating=" + rating +
                ", reviewCreatedOn='" + reviewCreatedOn + '\'' +
                ", reviewCreatedOnDate='" + reviewCreatedOnDate + '\'' +
                ", reviewCreatedOnTime=" + reviewCreatedOnTime +
                ", reviewerId='" + reviewerId + '\'' +
                ", reviewerUrl='" + reviewerUrl + '\'' +
                ", reviewerName='" + reviewerName + '\'' +
                ", reviewerEmail='" + reviewerEmail + '\'' +
                ", sourceType='" + sourceType + '\'' +
                ", isVerified=" + isVerified +
                ", source='" + source + '\'' +
                ", sourceName='" + sourceName + '\'' +
                ", sourceId='" + sourceId + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", href=" + href +
                ", logoHref=" + logoHref +
                ", photos=" + Arrays.toString(photos) +
                '}';
    }
}
public class ReviewSort {
    private JPanel main;
    private JLabel label1;
    private JComboBox comboBox1;
    private JLabel label2;
    private JComboBox comboBox2;
    private JLabel label3;
    private JComboBox comboBox3;
    private JLabel label4;
    private JComboBox comboBox4;
    private JLabel label5;
    private JButton filterButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SortReviews");
        ReviewSort reviewSort = new ReviewSort();
        frame.setContentPane(reviewSort.main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(800,300,400,400);
        frame.setVisible(true);
    }

    public List<Review> readJSON(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Review> reviews = Arrays.asList(mapper.readValue(Paths.get("src/reviews.json").toFile(), Review[].class));
            return reviews;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public ReviewSort(){
        List<Review> list = readJSON();

        List<Review> list2 = new ArrayList<>();

        filterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Comparator<Review> comparator = null;

                String comboBox1Selected = comboBox1.getSelectedItem().toString();
                String comboBox3Selected = comboBox3.getSelectedItem().toString();
                String comboBox4Selected = comboBox4.getSelectedItem().toString();

                if(comboBox4Selected.equals("No")){
                    if(comboBox1Selected.equals("Lowest First") && comboBox3Selected.equals("Oldest First"))
                        comparator = Comparator.comparing(Review::getRating).thenComparing(Review::getReviewCreatedOnDate);
                    else if(comboBox1Selected.equals("Highest First") && comboBox3Selected.equals("Oldest First"))
                        comparator = Comparator.comparing(Review::getRating).reversed().thenComparing(Review::getReviewCreatedOnDate);
                    else if(comboBox1Selected.equals("Lowest First") && comboBox3Selected.equals("Newest First"))
                        comparator = (Comparator.comparing(Review::getRating).reversed().thenComparing(Review::getReviewCreatedOnDate)).reversed();
                    else
                        comparator = Comparator.comparing(Review::getRating).thenComparing(Review::getReviewCreatedOnDate).reversed();
                }
                else{
                    if(comboBox1Selected.equals("Lowest First") && comboBox3Selected.equals("Oldest First"))//reviews with reviewText are not sorted correctly
                        comparator = Comparator.comparing(Review::getReviewText).reversed().thenComparing(Review::getRating).thenComparing(Review::getReviewCreatedOnDate);
                    else if(comboBox1Selected.equals("Highest First") && comboBox3Selected.equals("Oldest First"))
                        comparator = Comparator.comparing(Review::getReviewText).thenComparing(Review::getRating).reversed().thenComparing(Review::getReviewCreatedOnDate);
                    else if(comboBox1Selected.equals("Lowest First") && comboBox3Selected.equals("Newest First"))//reviews with reviewText are not sorted correctly
                        comparator = (Comparator.comparing(Review::getReviewText).reversed().thenComparing(Review::getRating).reversed().thenComparing(Review::getReviewCreatedOnDate)).reversed();
                    else
                        comparator = Comparator.comparing(Review::getReviewText).thenComparing(Review::getRating).thenComparing(Review::getReviewCreatedOnDate).reversed();
                }
                list.sort(comparator);

                String minimumRating = comboBox2.getSelectedItem().toString();
                for(Review review: list) {
                    int reviewRating = review.getRating();
                    if(Integer.toString(reviewRating).compareTo(minimumRating) >= 0){
                        list2.add(review);
                    }
                }

                for(Review review: list2){
                    System.out.println(review);
                }
            }
        });
    }
}
