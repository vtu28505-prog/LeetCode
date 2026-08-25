class Solution {
    public boolean isPalindrome(ListNode head) {

        int count = 0;
        ListNode current = head;

        // Count nodes
        while (current != null) {
            count++;
            current = current.next;
        }

        // Store values in array
        int[] arr = new int[count];
        current = head;

        int i = 0;
        while (current != null) {
            arr[i] = current.val;
            i++;
            current = current.next;
        }

        // Compare first and last
        int left = 0;
        int right = count - 1;

        while (left < right) {

            if (arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}