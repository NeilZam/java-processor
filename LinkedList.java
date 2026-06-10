package assingment3;
import java.io.*;
import java.util.Scanner;
class LinkedList {
	   private Node top;

	    public void construct(String fname) {
	        try (Scanner scanner = new Scanner(new File(fname))) {
	            Node end = null;
	            while (scanner.hasNextInt()) {
	                int num = scanner.nextInt();
	                if (num > 0) {
	                    Node newNode = new Node(num);
	                    if (top == null) {
	                        top = newNode;
	                    } else {
	                        end.setNext(newNode);
	                    }
	                    end = newNode;
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public void process() {
	        if (top == null) return;
	        
	        Node prev = top;
	        Node current = top.getNext();
	        int count = -100;
	        
	        while (current != null) {
	            if (current.getObject() == (prev.getObject() * 2 + 7)) {
	                Node newNode = new Node(count);
	                newNode.setNext(current.getNext());
	                if (prev == top) {
	                    top = newNode;
	                } else {
	                    Node temp = top;
	                    while (temp.getNext() != prev) {
	                        temp = temp.getNext();
	                    }
	                    temp.setNext(newNode);
	                }
	                count++;
	                prev = newNode;
	                current = newNode.getNext();
	            } else {
	                prev = current;
	                current = current.getNext();
	            }
	        }
	        
	        Node end = top;
	        while (end.getNext() != null) {
	            end = end.getNext();
	        }
	        end.setNext(new Node(count));
	    }
	    
	    public void printToFile(String fname) {
	        try (PrintWriter writer = new PrintWriter(new File(fname))) {
	            Node current = top;
	            while (current != null) {
	                writer.print(current.getObject() + " ");
	                current = current.getNext();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
