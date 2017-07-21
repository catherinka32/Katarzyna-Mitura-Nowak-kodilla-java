package com.kodilla.testing.forum.statistics;

/**
 * Created by Iga on 17.07.2017.
 */
public class StatisticMaker{
    Statistics statistics;
    private int amountOfUsers;
    private int amountOfPosts ;
    private int amountOfComment;
    private double avaragePostPerUser;
    private double avarageCommentPerUser;
    private double averageCommentPerPost;

    public int getAmountOfUsers() {
        return amountOfUsers;
    }
    public int getAmountOfPosts() {
        return amountOfPosts;
    }

    public void setAmountOfPosts(int amountOfPosts) {
        amountOfPosts = amountOfPosts;
    }

    public int getAmountOfComment() {
        return amountOfComment;
    }

    public void setAmountOfComment(int amountOfComment) {
        amountOfComment = amountOfComment;
    }

    public double getAvaragePostPerUser() {
        return avaragePostPerUser;
    }

    public void setAvaragePostPerUser(double avaragePostPerUser) {
        avaragePostPerUser = avaragePostPerUser;
    }

    public double getAvarageCommentPerUser() {
        return avarageCommentPerUser;
    }

    public void setAvarageCommentPerUser(double avarageCommentPerUser) {
         avarageCommentPerUser = avarageCommentPerUser;
    }

    public double getAverageCommentPerPost() {
        return averageCommentPerPost;
    }

    public StatisticMaker(Statistics statistics) {
        this.statistics = statistics;
    }
    public void calculateAdvStatistics(Statistics statistics){
        int amountOfUsers = statistics.usersNames().size();
        int amountOfPosts = statistics.postsCount();
        int amountOfComment = statistics.commentsCount();
        double avaragePostPerUser = amountOfPosts/amountOfUsers;
        double avarageCommentPerUser = amountOfComment/amountOfUsers;
        double averageCommentPerPost = amountOfComment/amountOfPosts;

    }
}
