public class TaskLinkedList {
    private Node head;

    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public boolean deleteTask(String taskId) {
        if (head == null) {
            return false;
        }

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
            current = current.next;
        }

        if (current.next == null) {
            return false;
        }

        current.next = current.next.next;
        return true;
    }

    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task("T001", "Design Database Schema", "In Progress"));
        taskList.addTask(new Task("T002", "Implement Authentication", "Pending"));
        taskList.addTask(new Task("T003", "Develop UI Mockups", "Completed"));
        taskList.addTask(new Task("T004", "Setup CI/CD Pipeline", "In Progress"));

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearch for Task with ID 'T002':");
        Task searchResult = taskList.searchTask("T002");
        System.out.println(searchResult != null ? searchResult : "Task not found.");

        System.out.println("\nDelete Task with ID 'T003':");
        boolean isDeleted = taskList.deleteTask("T003");
        System.out.println(isDeleted ? "Task deleted." : "Task not found.");

        System.out.println("\nAll Tasks after deletion:");
        taskList.traverseTasks();
    }
}
