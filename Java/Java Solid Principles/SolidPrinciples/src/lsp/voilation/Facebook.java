package lsp.voilation;
// Social Media can be substituted by Facebook
public class Facebook extends SocialMedia {

    public void chatWithFriend() {
        System.out.println("Send message to friend");
    }

    public void publishPost(Object post) {
        System.out.println("Publish the post");
    }

    public void sendPhotosAndVideos() {
        System.out.println("Send photos and videos");
    }

    public void groupVideoCall(String... users) {
        System.out.println("Group calling");
    }
}
