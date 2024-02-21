package lsp.solution;
// Liskov Substitution Principle: States that derive class must be substitutable by base class
//if class A is a subtype of class B, then we should be able to replace B with A without interrupting
public interface PostMediaManager {

    public  void publishPost(Object post);
}
