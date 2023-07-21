#include <iostream>
using namespace std;

struct Node {
    int data;
    Node *next;
} *head = nullptr;

void create(int n ) {
    head = new Node();
    head->data= n;
    head->next = nullptr;
}

void insert(int n) {
    if (head == nullptr) {
        create(n) ;
        return;
    }

    Node *newNode = new Node();
    newNode->data = n;
    newNode->next = head;
    head = newNode;
}

void display() {
    if (head == nullptr) {
        cout << "NULL"<<endl;
        return;

    }

    Node *t = head;
    while (t != nullptr) {
        cout << t->data << " ";
        t = t->next;
    }
    cout << endl;
}

int main() {
    insert(4);
    insert(3);
    insert(2);
    insert(1);
    display();
    return 0;
}