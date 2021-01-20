package AccessModifiers.AccessModifiersChallenge;

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}

// answers:
// 1. it's set to package private, so, in other words, it's accessible to all classes, in this case, in
// the nl.novi.AccessModifiersChallenge package
// 2. the visibility was set to public, and what that means is all interface variables are public static final
// 3. it's public; it's just a standard public
// 4. public because all interface methods are automatically public, so the lack of an access modifier here does not
// imply package private. You can make the methods effectively package private by ensuring that the interface itself is
// package private as we've done here