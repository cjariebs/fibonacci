// fibonacci, converted from java

#include <iostream>
using namespace std;

class Fibonacci {
    public:
	unsigned long int recursive(int n) {
	    return ((n <= 1) ? 1 : this->recursive(n-1)+this->recursive(n-2));
	}
	
	unsigned long int iterative(int n) {
	    if (n <= 1) return 1;

	    unsigned long int a = 0;
	    unsigned long int b = 1;
	    unsigned long int c = 0;

	    int i;
	    for (i = 0; i < n; i++) {
		c = a+b;

		a = b;
		b = c;
	    }

	    return c;
	}
};

int main() {
    Fibonacci fibo;
    cout << fibo.iterative(10) << endl;
    cout << fibo.recursive(10) << endl;
    return 0;
}
