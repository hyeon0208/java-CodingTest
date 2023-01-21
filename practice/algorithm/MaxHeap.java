package algorithm;

import java.util.ArrayList;
import java.util.List;

class MaxHeap {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();

        maxHeap.insert(9);
        maxHeap.insert(7);
        maxHeap.insert(6);
        maxHeap.insert(5);
        maxHeap.insert(4);
        maxHeap.insert(3);
        maxHeap.insert(2);
        maxHeap.insert(2);
        maxHeap.insert(1);
        maxHeap.insert(3);
        System.out.println("Heap : " + maxHeap);

        maxHeap.insert(8);
        System.out.println("8이 삽입된 Heap : " + maxHeap);

        maxHeap.delete();
        System.out.println("루트 노드를 삭제한 Heap : " + maxHeap);
    }

    private static List<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<Integer>();
        heap.add(0); //첫번째 인덱스는 사용하지 않음
    }

    //삽입
    public void insert(int num) {
        //맨 마지막 위치에 삽입
        heap.add(num);

        int newNodeIdx = heap.size() - 1; //새로 넣은 노드의 인덱스 위치 정보
        //루트까지 이동. ( 부모보다 자식이 더 크면 교환 )
        while (newNodeIdx > 1 && heap.get(newNodeIdx) > heap.get(newNodeIdx / 2)) {
            int parentNode = heap.get(newNodeIdx / 2);

            // 부모 노드와 자식 노드 교환
            heap.set(newNodeIdx / 2, heap.get(newNodeIdx));
            heap.set(newNodeIdx, parentNode);

            // 교환이 일어 났다면 자식 인덱스를 부모 인덱스로 변경.
            newNodeIdx /= 2;
        }
    }

    //삭제
    public int delete() {
        // 힙 이 비어있으면 0 리턴
        if (heap.size() - 1 < 1) {
            return 0;
        }

        // 삭제할 루트 노드 값 저장
        int deleteNode = heap.get(1);

        // 맨 마지막 자식 노드를 루트 노드와 교체한 뒤, 마지막 값 삭제
        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        // 루트에 새로 넣은 노드의 인덱스 정보
        int newRoot = 1;

        while ((newRoot * 2) < heap.size()) {
//            int leftChild = heap.get(newRoot * 2);
//            int rightChild = heap.get(newRoot * 2 + 1);
//            int leftIdx = newRoot * 2;
//            int rightIdx = newRoot * 2 + 1;
            int leftChild = heap.get(newRoot * 2);
            int leftIdx = newRoot * 2;

            //오른쪽 자식이 존재하고 오른쪽 자식이 왼쪽 자식보다 클때 바꿀 자식 오른쪽으로 설정
            if ((newRoot * 2 + 1) < heap.size() && leftIdx < heap.get(newRoot * 2 + 1)) {
                leftChild = heap.get(newRoot * 2 + 1);
                leftIdx = newRoot * 2 + 1;
            }

            // 부모가 더 크면 끝
            if (heap.get(newRoot) > leftChild) {
                break;
            }

            //자식이 더 크면 교환
            int tmp = heap.get(newRoot);
            heap.set(newRoot, leftChild);
            heap.set(leftIdx, tmp);
            newRoot = leftIdx;
        }

        return deleteNode;
    }

    @Override
    public String toString() {
        return heap.toString();
    }
}