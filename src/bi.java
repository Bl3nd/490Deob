final class bi {
	
	static ob huffman = rf.a(40, "huffman");
	static int b;
	static int c;
	static int d;
	static ob e = rf.a(40, "gr-Un:");
	static int f = 0;
	static int g;
	static int h;
	
	static boolean a(byte unused, ra ra) {
		try {
			++d;
			if (jh.j) {
				if (ce.a(ra, 18125) != 0) {
					return false;
				}
				
				if (ra.Ac == 0) {
					return false;
				}
			}
			
			return ra.E;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "bi.A(" + unused + ',' + (ra != null ? "{...}" : "null") + ')');
		}
	}
	
	static ob a(int unused, int unused2, int length, ob[] obs) {
		int dummy = client.anInt_wb;
		
		try {
			++g;
			int i = 0;
			int i1 = 0;
			if (dummy != 0) {}
			if (/*dummy != 0 || */length > i1) {
				do {
					if (obs[i1] == null) {
						obs[i1] = af.N;
					}
					
					i += obs[i1].length;
					++i1;
				} while (length > i1);
			}
			
			byte[] bytes = new byte[i];
			int i2 = 0;
			int i3 = 0;
			ob ob;
			if (dummy != 0) {/*
				ob = obs[i3 + unused2];
				p.a(ob.r, 0, bytes, i2, ob.v);
				i2 += ob.v;
				++i3;
			*/}
			
			while (~length < ~i3) {
				ob = obs[i3];
				p.arrayCopy(ob.buffer, 0, bytes, i2, ob.length);
				i2 += ob.length;
				++i3;
			}
			
			ob = new ob();
			ob.length = i;
			ob.buffer = bytes;
			return ob;
		} catch (RuntimeException var12) {
			throw bc.a(var12, "bi.C(" + unused + ',' + unused2 + ',' + length + ',' + (obs != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void a(int unused) {
		try {
			huffman = null;
			e = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "bi.D(" + unused + ')');
		}
	}
	
	static void a(byte unused, int id) {
		try {
			++b;
			
			ng ng = (ng) jg.a.a((long) id, 22346);
			if (ng != null) {
				ng.c(128);
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "bi.B(" + unused + ',' + id + ')');
		}
	}
	
	static void a(int planeCount, int chunkCount1, int chunkCount2, int[][][] ints) {
		ki.s = planeCount;
		qd.L = chunkCount1;
		wc.J = chunkCount2;
		nb.oc = new pd[planeCount][chunkCount1][chunkCount2];
		ob.Y = new int[planeCount][chunkCount1 + 1][chunkCount2 + 1];
		la.v = ints;
		qg.a();
	}
}
