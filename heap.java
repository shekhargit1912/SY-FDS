
import java.util.Scanner;
public class Main
{
	public static void maxHeapify(int[] heap, int i, int n)
	{
		int left = 2 * i;
		int right = (2 * i) + 1;
		int largest = i;

		if (left <= n && heap[i] < heap[left])
		{
			largest = left;
		}
		if (right <= n && heap[largest] < heap[right])
		{
			largest = right;
		}

			if (largest != i)
			{
				int temp = heap[largest];
				heap[largest] = heap[i];
				heap[i] = temp;
				maxHeapify(heap, largest, n);
			}
	}
	public static void buildHeap(int[] heap, int n)
	{
				for (int i = n / 2;i >= 1;i--)
				{
				maxHeapify(heap, i, n);
				}


	}
	public static void main(String[] args)
	{
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter No Of Elements ");
		n = input.nextInt();
		int[] a = new int[n];
		int[] heap = new int[n + 1];
		System.out.print("Enter Element ");
		for (int i = 1;i <= n;i++)
		{
		heap[i] =input.nextInt();
		}

		buildHeap(heap, n);
		int heapSize = n;
		for (int i = n;i >= 2;i--)
		{
			int temp = heap[1];
			heap[1] = heap[i];
			heap[i] = temp;
			--heapSize;
			maxHeapify(heap, 1, heapSize);
		}
		System.out.print("After Sorting ");
		System.out.print("\n");
		for (int i = 1;i <= n;i++)
		{
		System.out.print(heap[i]);
		System.out.print(" ");
		}
		System.out.print("MAXIMUM MARKS ::");
		System.out.print(heap[n]);
		System.out.print("\n");
		System.out.print("MINIMUM MARKS ::");
		System.out.print(heap[1]);
		System.out.print("\n");
	}
}
