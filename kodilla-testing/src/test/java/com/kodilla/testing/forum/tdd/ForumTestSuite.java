package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.TheForumUser;
import org.junit.*;

//Test suite for classes of Forum
public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddPost() {
        //Given
        TheForumUser forumUser = new TheForumUser("mrsmith", "John Smith");

        //When
        forumUser.addPost("mrsmith",
                "Hello everyone, this is my first contribution here!");

        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());

    }
    @Test
    public void testAddComment() {
        //Given
        TheForumUser forumUser = new TheForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");

        //When
        forumUser.addComment(thePost, "mrsmith", "Thank you for all good words!");

        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    public void testGetPost() {
        //Given
        TheForumUser forumUser = new TheForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        //Then
        Assert.assertEquals(thePost, retrievedPost);
    }

    @Test
    public void testGetComment() {
        //Given
        TheForumUser forumUser = new TheForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());

        //When
        ForumComment retrievedComment = forumUser.getComment(0);

        //Then
        Assert.assertEquals(theComment, retrievedComment);
    }

    @Test
    public void testRemovePostNotExisting() {
        //Given
        TheForumUser forumUser = new TheForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting() {
        //Given

        TheForumUser forumUser1 = new TheForumUser("mrs", "John Smith");
        ForumPost thePost1 = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrs");
        ForumComment theComment1 = new ForumComment(thePost1, "mrs",
                "Thank you for all good words!");

        //When
        boolean result = forumUser1.removeComment(theComment1);

        //Then
        Assert.assertFalse(result);
    }


    @Test
    public void testContainsPost(){
        //given
        TheForumUser forumUser = new TheForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //when
        boolean result = forumUser.containsPost(thePost);
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testRemoveComment() {
        //Given
        TheForumUser forumUser = new TheForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}

