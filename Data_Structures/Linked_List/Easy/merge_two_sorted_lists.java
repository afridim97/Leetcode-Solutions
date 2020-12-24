/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        
        if(l1==null) return l2;
        
        else if(l2==null) return l1;
        
        ListNode pointer=null;
        
        ListNode head=null;
        
        if(l1.val<=l2.val){
            
            pointer=l1;
            
            l1=l1.next;
        }
        
        else{
            
            pointer=l2;
            
            l2=l2.next;
        }
        
        head=pointer;
        
        while(l1!=null && l2!=null){
            
            if(l1.val<=l2.val){
                
                pointer.next=l1;
                
                l1=l1.next;
            }
            
            else{
                
                pointer.next=l2;
                
                l2=l2.next;
            }
            
            pointer=pointer.next;
        }
        
        if(l1==null){
            
            pointer.next=l2;
        }
        
        else if(l2==null){
            
            pointer.next=l1;
        }
        
        return head;
    }
}
