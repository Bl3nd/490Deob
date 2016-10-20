final class pb {
	
	static int a = 0;
	static int b;
	static int c;
	static int anInt_d;
	static int e;
	static int f = 0;
	
	static void a(byte var0) {
		try {
			if (var0 == 10) {
				af.P.p(82, var0 + 12875);
				++b;
				af.P.writeLong(-123, 0L);
				++pi.p;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "pb.B(" + var0 + ')');
		}
	}
	
	static tc a(int var0, int var1) {
		try {
			++e;
			tc var2 = (tc) qa.j.a((long) var1, (byte) 117);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var4 = d.cacheFile2.a((byte) -97, var1, 4);
				var2 = new tc();
				if (var4 != null) {
					var2.a((byte) -28, var1, new og(var4));
				}
				
				qa.j.a(var2, (byte) -13, (long) var1);
				return var2;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "pb.A(" + var0 + ',' + var1 + ')');
		}
	}
}
