//url: https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1

class GFG{
  void deleteNode(Node current){
    current.data = current.next.data;
    current.next = current.next.next;
  }
}
/*
  //cpp aproach
  void deleteNode(Node * current){
    *current = *(current->next);
  }
*/
