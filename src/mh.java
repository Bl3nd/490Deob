final class mh {
	
	int[] a;
	int b;
	int c;
	int[] d;
	
	mh() {
		cg.f(16);
		this.c = cg.b() != 0 ? cg.f(4) + 1 : 1;
		if (cg.b() != 0) {
			cg.f(8);
		}
		
		cg.f(2);
		if (this.c > 1) {
			this.b = cg.f(4);
		}
		
		this.a = new int[this.c];
		this.d = new int[this.c];
		
		for (int var1 = 0; var1 < this.c; ++var1) {
			cg.f(8);
			this.a[var1] = cg.f(8);
			this.d[var1] = cg.f(8);
		}
		
	}
}
