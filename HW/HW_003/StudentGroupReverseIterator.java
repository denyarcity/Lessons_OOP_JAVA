package HW.HW_003;

import java.util.Iterator;

public class StudentGroupReverseIterator implements Iterator<Student> {

	private StudentGroup studentGroup;
	private int index;

	public StudentGroupReverseIterator(StudentGroup studentGroup) {
		this.studentGroup = studentGroup;
		this.index = studentGroup.getSize();
	}

	@Override
	public boolean hasNext() {
		return index > 0;
	}

	@Override
	public Student next() {
		return studentGroup.get(--index);
	}
}