
public class Problem3_3_1 {

}

class StopWatch{
	// data fields
	long startTime;
	long endTime;
	//constructors
	StopWatch(){
		startTime = System.currentTimeMillis(); }
	//methods
	void start() {
		startTime = System.currentTimeMillis(); }
	void end() {
		endTime = System.currentTimeMillis(); }
	long getElapsedTime() {
		return endTime - startTime; }



	
}
