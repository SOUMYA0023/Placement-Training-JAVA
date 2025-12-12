import java.util.Stack;

class BrowserHistory {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;

    public BrowserHistory(String homepage) {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = homepage;
    }

    // visit(String url): Visit a new webpage
    public void visit(String url) {
        backStack.push(currentPage);
        currentPage = url;
        forwardStack.clear();
    }

    // back(): Go back to previous webpage
    public String back() {
        if (backStack.isEmpty()) {
            return currentPage; // Nowhere to go
        }
        forwardStack.push(currentPage);
        currentPage = backStack.pop();
        return currentPage;
    }

    // forward(): Move forward if available
    public String forward() {
        if (forwardStack.isEmpty()) {
            return currentPage;
        }
        backStack.push(currentPage);
        currentPage = forwardStack.pop();
        return currentPage;
    }

    // getCurrentPage(): Return current page
    public String getCurrentPage() {
        return currentPage;
    }
}

public class Main {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("google.com");

        browser.visit("youtube.com");
        browser.visit("instagram.com");
        browser.visit("github.com");

        System.out.println("Current: " + browser.getCurrentPage()); // github

        browser.back();
        System.out.println("After back: " + browser.getCurrentPage()); // instagram

        browser.back();
        System.out.println("After back: " + browser.getCurrentPage()); // youtube

        browser.forward();
        System.out.println("After forward: " + browser.getCurrentPage()); // instagram

        browser.visit("stackoverflow.com");
        System.out.println("After visiting new page: " + browser.getCurrentPage()); // stackoverflow
    }
}