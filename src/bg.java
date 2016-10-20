class bg {
	
	private static ob a = rf.a(40, "level)2");
	static int b;
	static ob ob_c;
	static int anInt_d;
	static int anInt_e;
	static int f;
	static int[] ints_g;
	static int h;
	static short[] i;
	static volatile boolean j;
	static int k;
	static int anInt_l;
	
	static void a(int i, int i1, int i2, int i3, int i4, int unused, int i5, int i6) {
		int dummy = client.anInt_wb;
		
		try {
			++k;
			int i7 = kg.a(dd.a, na.anInt_m, true, i4);
			int i8 = kg.a(dd.a, na.anInt_m, true, i6);
			int i9 = kg.a(gh.R, ng.u, true, i2);
			int i10 = kg.a(gh.R, ng.u, true, i1);
			int i11 = kg.a(dd.a, na.anInt_m, true, i4 - -i);
			int i12 = kg.a(dd.a, na.anInt_m, true, i6 + -i);
			int i13 = i7;
			while (i11 > i13) {
				sa.a(i10, (byte) 52, i9, i5, e.ints_b[i13]);
				++i13;
			}
			
			int i14 = i8;
			if (/*dummy != 0 || */~i12 > ~i8) {
				do {
					sa.a(i10, (byte) 52, i9, i5, e.ints_b[i14]);
					--i14;
				} while (~i12 > ~i14);
			}
			
			int i15 = kg.a(gh.R, ng.u, true, i2 + i);
			int i16 = kg.a(gh.R, ng.u, true, -i + i1);
			int i17 = i11;
			if (~i11 < ~i12) {
				return;
			}
			
			do {
				int[] ints = e.ints_b[i17];
				sa.a(i15, (byte) 52, i9, i5, ints);
				sa.a(i16, (byte) 52, i15, i3, ints);
				sa.a(i10, (byte) 52, i16, i5, ints);
				++i17;
			} while (~i17 >= ~i12);
			
		} catch (RuntimeException var21) {
			throw bc.a(var21, "bg.H(" + i + ',' + i1 + ',' + i2 + ',' + i3 + ',' + i4 + ',' + unused + ',' + i5 + ',' + i6 + ')');
		}
	}
	
	static ob a(int i, boolean unused, ra ra) {
		try {
			++f;
			return !cd.a(ce.a(ra, 18125), i, 1)
					&& ra.A == null ? null : ra.Mc != null
					&& ~ra.Mc.length < ~i && ra.Mc[i] != null
					&& ra.Mc[i].d(38).a(false) != 0 ? ra.Mc[i] : jh.j ? wc.a(new ob[] {af.hidden, hh.a((byte) 93, i)}, -3) : null;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "bg.I(" + i + ',' + unused + ',' + (ra != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(boolean unused) {
		int dummy = client.anInt_wb;
		
		try {
			qf.I = 0;
			++anInt_e;
			nf.S = 0;
			e.a((byte) -106);
			client.f((byte) -116);
			fh.a(32);
			int i = 0;
			int pos;
			for (; ~i > ~nf.S; ++i) {
				pos = ue.gb[i];
				if (bi.f != ai.M[pos].Ub) {
					ai.M[pos].pc = null;
					ai.M[pos] = null;
				}
			}
			
			if (~sh.packetSize != ~pg.packetBuffer.pointer) {
				throw new RuntimeException("gnp1 pos:" + pg.packetBuffer.pointer + " psize:" + sh.packetSize);
			} else {
				pos = 0;
				if (~pos > ~tf.n) {
					do {
						if (ai.M[ud.Xb[pos]] == null) {
							throw new RuntimeException("gnp2 pos:" + pos + " size:" + tf.n);
						}
						
						++pos;
					} while (~pos > ~tf.n);
					
				}
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "bg.G(" + unused + ')');
		}
	}
	
	public static void a(byte unused) {
		try {
			a = null;
			ints_g = null;
			ob_c = null;
			i = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "bg.F(" + unused + ')');
		}
	}
	
	static {
		ob_c = a;
		h = -1;
		i = new short[] {(short) 40, (short) 30, (short) 29, (short) 44, (short) 2, (short) 19, (short) 16, (short) 6};
		j = false;
	}
}
