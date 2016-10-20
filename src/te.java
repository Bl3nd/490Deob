final class te extends hg {
	
	private long i;
	
	final void a(byte var1) {
		if (var1 == 112) {
			this.i = System.nanoTime();
		}
	}
	
	final int a(int var1, int var2, int var3) {
		long var6 = this.i - System.nanoTime();
		int var10 = 0;
		long var4 = (long) var2 * 1000000L;
		if (var4 > var6) {
			var6 = var4;
		}
		
		if (var1 > -93) {
			this.i = 118L;
		}
		
		jd.a(var6 / 1000000L, (byte) -8);
		
		long var8;
		for (var8 = System.nanoTime(); 10 > var10 && (var10 < 1 || ~this.i > ~var8); ++var10) {
			this.i += (long) var3 * 1000000L;
		}
		
		if (~var8 < ~this.i) {
			this.i = var8;
		}
		
		return var10;
	}
	
	te() {
		try {
			this.i = System.nanoTime();
		} catch (RuntimeException var2) {
			throw var2;
		}
	}
}
