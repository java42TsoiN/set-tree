package telran.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;
import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeRecursionTest {
	TreeSet<Integer> tree;

	@BeforeEach
	void setUp() throws Exception {
		tree = new TreeSet<>();
		tree.add(30);
		tree.add(40);
		tree.add(35);
		tree.add(80);
		tree.add(60);
		tree.add(100);
		tree.add(90);
		tree.add(15);	
	}

	@Test
	void widthTest() {
		assertEquals(4, tree.width());
	}

	@Test
	void heightTest() {
		assertEquals(5, tree.height());
	}

	@Test
	void displayTreeTest() {
		tree.displayTree();
	}
	@Test
	void displayTreeFileSystemTest() {
		tree.displayTreeFileSystem();
	}
	
	@Test
	void maxBranchSumTest() {
		TreeSet<Integer> tree = getTreeForTest();
		assertEquals(36, tree.sumOfMaxBranch());
	}

	private TreeSet<Integer> getTreeForTest() {
		TreeSet<Integer> tree1 = new TreeSet<>((a,b)->getDigitsNumber(a)-getDigitsNumber(b));
		tree1.add(4);
		tree1.add(6);
		tree1.add(5);
		tree1.add(7);
		tree1.add(11);
		tree1.add(21);
		tree1.displayTree();
		return tree1;
	}

	private int getDigitsNumber(Integer num) {
		if(num==0) {
			return 0;
		}
		return (num%10)+getDigitsNumber(num/10);
	}

}
