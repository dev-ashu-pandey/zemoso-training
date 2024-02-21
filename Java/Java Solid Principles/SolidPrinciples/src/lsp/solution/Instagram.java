package lsp.solution;

public class Instagram implements SocialMedia,PostMediaManager{

    public void publishPost(Object post) {
        System.out.println("Publish post on social media");
    }

    public void chatWithFriend() {
        System.out.println("Send message to friend");
    }

    public void sendPhotosAndVideos() {
        System.out.println("Send photos and videos");
    }
}
