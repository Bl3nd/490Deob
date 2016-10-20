final class be {
	
	static ob logo = rf.a(40, "logo");
	static int b;
	static int c;
	static int d;
	static int e;
	static int[] f = new int[100];
	static boolean forceSend;
	static int[] h;
	static int[] i = new int[] {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	static ra j;
	static int k;
	static int l = 0;
	
	public static void a(int unused) {
		try {
			h = null;
			f = null;
			j = null;
			logo = null;
			i = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "be.C(" + unused + ')');
		}
	}
	
	static void a(int i, int i1, int unused, int i2, int i3, int i4, int i5, int i6, int i7) {
		try {
			++d;
			if (!gf.a(true, i4)) {
				if (i1 != -1) {
					ob.bb[i1] = true;
				} else {
					int i8 = 0;
					while (~i8 > -101) {
						ob.bb[i8] = true;
						++i8;
					}
				}
			} else {
				wf.n = null;
				ja.a(i3, i5, i, i1, -1, wg.cb[i4], i7, i2, 16, i6);
				if (wf.n != null) {
					ja.a(i3, i5, i, i1, -1412584499, wf.n, lb.Z, ld.w, 16, i6);
					wf.n = null;
				}
			}
		} catch (RuntimeException var11) {
			throw bc.a(var11, "be.A(" + i + ',' + i1 + ',' + unused + ',' + i2 + ',' + i3 + ',' + i4 + ',' + i5 + ',' + i6 + ',' + i7 + ')');
		}
	}
	
	static void a(int i, ob[] obs, int length, short[] shorts, int unused) {
		int dummy = client.anInt_wb;
		
		try {
			++k;
			if (i < length) {
				int i1 = (i + length) / 2;
				int i2 = i;
				ob ob = obs[i1];
				obs[i1] = obs[length];
				obs[length] = ob;
				short s = shorts[i1];
				shorts[i1] = shorts[length];
				shorts[length] = s;
				int i3 = i;
				if (/*dummy == 0 && */~i <= ~length) {
					obs[length] = obs[i];
					obs[i] = ob;
					shorts[length] = shorts[i];
					shorts[i] = s;
					a(i, obs, -1 + i, shorts, -129);
					a(1 + i, obs, length, shorts, -129);
				} else {
					do {
						ob ob1;
						short s2;
						if (ob != null) {
							if (obs[i3] != null) {
								if ((i3 & 1) > obs[i3].c(ob, (byte) -117)) {
									ob1 = obs[i3];
									obs[i3] = obs[i2];
									obs[i2] = ob1;
									s2 = shorts[i3];
									shorts[i3] = shorts[i2];
									shorts[i2++] = s2;
									++i3;
								} else {
									++i3;
								}
							} else {
								++i3;
							}
						} else {
							ob1 = obs[i3];
							obs[i3] = obs[i2];
							obs[i2] = ob1;
							s2 = shorts[i3];
							shorts[i3] = shorts[i2];
							shorts[i2++] = s2;
							++i3;
						}
					} while (~i3 > ~length);
					
					obs[length] = obs[i2];
					obs[i2] = ob;
					shorts[length] = shorts[i2];
					shorts[i2] = s;
					a(i, obs, -1 + i2, shorts, -129);
					a(1 + i2, obs, length, shorts, -129);
				}
			}
		} catch (RuntimeException var13) {
			throw bc.a(var13, "be.D(" + i + ',' + "{...}" + ',' + length + ',' + "{...}" + ',' + unused + ')');
		}
	}
	
	static void a(int fileId, int cacheId, byte var2) {
		try {
			++e;
			long id = (long) ((cacheId << 16) + fileId);
			v v = (v) uc.ib.a(id, 22346);
			if (v != null) {
				mg.a.a(v, -115);
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "be.B(" + fileId + ',' + cacheId + ',' + var2 + ')');
		}
	}
}
