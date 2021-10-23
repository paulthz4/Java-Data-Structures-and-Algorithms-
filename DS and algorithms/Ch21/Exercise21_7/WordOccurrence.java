package Ch21.Exercise21_7;

/*WordOccurrence that implements the Comparable      *
* interface. The class contains two fields, word and count. The compareTo method *
* compares the counts.*/
public class WordOccurrence implements Comparable<WordOccurrence>{
	String word;
	Integer count = 0;
	
	public WordOccurrence(String word, Integer count) {
		this.word = word;
		this.count = count;
	}
	@Override
	public int compareTo(WordOccurrence o) {
		// TODO Auto-generated method stub
		return o.count.compareTo(count);
	}
	@Override /** Override the toString method in the */
	public String toString() {
		return word + "=" + count;
	}
}
