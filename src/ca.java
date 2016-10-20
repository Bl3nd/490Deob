final class ca extends pe {
	
	static int eb;
	private qe fb;
	static fa[] gb;
	static ob pleaseTryUsingADifferentWorld3;
	private boolean ib = false;
	private int jb = -1;
	static kc[] kb;
	static kc[] lb;
	private int mb;
	private int anint_nb;
	static int ob;
	static int pb;
	static ob qb;
	static ob rb;
	static ob pleaseTryUsingADifferentWorld6;
	static int tb;
	static int ub;
	static int vb;
	static int anint_wb;
	private int xb;
	static int yb;
	private static ob pleaseTryUsingADifferentWorld = rf.a(40, "Please try using a different world)3");
	static ob pleaseTryUsingADifferentWorld2;
	static ob pleaseTryUsingADifferentWorld4;
	static ob ams;
	static int Db;
	static ob Eb;
	static int Fb;
	private volatile boolean Gb = false;
	static int Hb;
	static ob pleaseTryUsingADifferentWorld7;
	static int Jb;
	private qe Kb;
	private volatile boolean[] Lb;
	private static ob Mb;
	static ob[] Nb;
	static int Ob;
	static int Pb;
	static int Qb;
	static ob pleaseTryUsingADifferentWorld5;
	
	final void a(byte unused, int clientScriptId, byte[] data, boolean flag, qe qe) {
		try {
			++Ob;
			int i1;
			if (qe != this.Kb) {
				if (!flag && ~clientScriptId == ~this.jb) {
					this.Gb = true;
				}
				
				if (data == null || data.length <= 2) {
					this.Lb[clientScriptId] = false;
					if (this.ib || flag) {
						ee.a(this, flag, this.anint_nb, (byte) 2, -18963, super.e[clientScriptId], clientScriptId);
					}
					return;
				}
				
				oh.S.reset();
				oh.S.update(data, 0, data.length + -2);
				i1 = (int) oh.S.getValue();
				int i2 = ('\uff00' & data[-2 + data.length] << 8) + (255 & data[data.length + -1]);
				if (super.e[clientScriptId] != i1 || ~i2 != ~super.w[clientScriptId]) {
					this.Lb[clientScriptId] = false;
					if (this.ib || flag) {
						ee.a(this, flag, this.anint_nb, (byte) 2, -18963, super.e[clientScriptId], clientScriptId);
					}
				} else {
					this.Lb[clientScriptId] = true;
					if (flag) {
						super.Q[clientScriptId] = nf.a(true, false, data);
					}
				}
			} else {
				if (this.Gb) {
					throw new RuntimeException();
				}
				
				if (data == null) {
					ee.a(this, true, 255, (byte) 0, -18963, this.mb, this.anint_nb);
					return;
				}
				
				oh.S.reset();
				oh.S.update(data, 0, data.length);
				i1 = (int) oh.S.getValue();
				if (~i1 != ~this.mb) {
					ee.a(this, true, 255, (byte) 0, -18963, this.mb, this.anint_nb);
					return;
				}
				
				og og;
				try {
					og = new og(kh.a(data, 115));
				} catch (RuntimeException var10) {
					ee.a(this, true, 255, (byte) 0, -18963, this.mb, this.anint_nb);
					return;
				}
				
				int i2 = og.readUnsignedByte(255);
				if (i2 != 5 && i2 != 6) {
					ee.a(this, true, 255, (byte) 0, -18963, this.mb, this.anint_nb);
					return;
				}
				
				int i3 = 0;
				if (i2 >= 6) {
					i3 = og.readInt(1029109968);
				}
				
				if (~i3 != ~this.xb) {
					ee.a(this, true, 255, (byte) 0, -18963, this.mb, this.anint_nb);
					return;
				}
				
				this.a((byte) 91, data);
				this.c((byte) -59);
			}
			
		} catch (RuntimeException var11) {
			throw bc.a(var11, "ca.B(" + unused + ',' + clientScriptId + ',' + (data != null ? "{...}" : "null") + ',' + flag + ',' + (qe != null ? "{...}" : "null") + ')');
		}
	}
	
	final void a(int fileId, boolean unused) {
		try {
			++ub;
			if (this.b(fileId, 0)) {
				if (this.fb != null && this.Lb != null && this.Lb[fileId]) {
					dh.a(fileId, this, this.fb, false);
				} else {
					ee.a(this, true, this.anint_nb, (byte) 2, -18963, super.e[fileId], fileId);
				}
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ca.E(" + fileId + ',' + unused + ')');
		}
	}
	
	static void a(cd[] paramArrayOfcd, int[] paramArrayOfInt1, int paramInt1, int[] paramArrayOfInt2, int paramInt2, int paramInt3) {
		int i3 = client.anInt_wb;
		try {
			if ((~paramInt3) < (~paramInt1)) {
				int j = 1 + paramInt3;
				int i = paramInt1 - 1;
				int k = (paramInt1 - -paramInt3) / 2;
				cd localcd1 = paramArrayOfcd[k];
				paramArrayOfcd[k] = paramArrayOfcd[paramInt1];
				paramArrayOfcd[paramInt1] = localcd1;
				while (i < j) {
					int m = 1;
					int n;
					int i2;
					int i1;
					do {
						j--;
						n = 0;
						while ((~n) > -5) {
							if (paramArrayOfInt2[n] == 2) {
								i2 = localcd1.h;
								i1 = paramArrayOfcd[j].h;
							} else if ((~paramArrayOfInt2[n]) == -2) {
								i2 = localcd1.e;
								i1 = paramArrayOfcd[j].e;
								if (((~i1) == 0) && (paramArrayOfInt1[n] == 1)) {
									i1 = 2001;
								}
								if (((~i2) == 0) && ((~paramArrayOfInt1[n]) == -2)) {
									i2 = 2001;
								}
							} else if (paramArrayOfInt2[n] != 3) {
								i2 = localcd1.k;
								i1 = paramArrayOfcd[j].k;
							} else {
								i2 = !localcd1.d ? 0 : 1;
								i1 = paramArrayOfcd[j].d ? 1 : 0;
							}
							if ((~i1) == (~i2)) {
								if (n == 3) {
									m = 0;
								}
							} else {
								if ((((~paramArrayOfInt1[n]) == -2) && ((~i2) > (~i1)) && (i3 == 0)) || ((paramArrayOfInt1[n] == 0) && ((~i2) < (~i1)))) {
									break;
								}
								m = 0;
								if (i3 == 0) {
									break;
								}
							}
							n++;
						}
					} while (m != 0);
					m = 1;
					do {
						i++;
						n = 0;
						while ((~n) > -5) {
							if ((~paramArrayOfInt2[n]) == -3) {
								i1 = paramArrayOfcd[i].h;
								i2 = localcd1.h;
							} else if ((~paramArrayOfInt2[n]) != -2) {
								if (paramArrayOfInt2[n] == 3) {
									i1 = paramArrayOfcd[i].d ? 1 : 0;
									i2 = !localcd1.d ? 0 : 1;
								} else {
									i2 = localcd1.k;
									i1 = paramArrayOfcd[i].k;
								}
							} else {
								i2 = localcd1.e;
								i1 = paramArrayOfcd[i].e;
								if ((i1 == -1) && ((~paramArrayOfInt1[n]) == -2)) {
									i1 = 2001;
								}
								if ((i2 == -1) && ((~paramArrayOfInt1[n]) == -2)) {
									i2 = 2001;
								}
							}
							if ((~i1) == (~i2)) {
								if ((~n) == -4) {
									m = 0;
								}
							} else {
								if ((((~paramArrayOfInt1[n]) == -2) && (i1 < i2)) || ((paramArrayOfInt1[n] == 0) && (i2 < i1))) {
									break;
								}
								m = 0;
								if (i3 == 0) {
									break;
								}
							}
							n++;
						}
					} while (m != 0);
					if (i < j) {
						cd localcd2 = paramArrayOfcd[i];
						paramArrayOfcd[i] = paramArrayOfcd[j];
						paramArrayOfcd[j] = localcd2;
					}
				}
				a(paramArrayOfcd, paramArrayOfInt1, paramInt1, paramArrayOfInt2, 25097, j);
				a(paramArrayOfcd, paramArrayOfInt1, 1 + j, paramArrayOfInt2, 25097, paramInt3);
			}
			ob += 1;
			if (paramInt2 != 25097) {
				Pb = 65408;
			}
		} catch (RuntimeException localRuntimeException) {
			throw bc.a(localRuntimeException, "ca.M(" + (paramArrayOfcd != null ? "{...}" : "null") + ',' + (paramArrayOfInt1 != null ? "{...}" : "null") + ',' + paramInt1 + ',' + (paramArrayOfInt2 != null ? "{...}" : "null") + ',' + paramInt2 + ',' + paramInt3 + ')');
		}
		
	}
	
	final void e(int unused, int fileId) {
		try {
			++yb;
			if (this.b(fileId, 0)) {
				be.a(fileId, this.anint_nb, (byte) -84);
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ca.F(" + unused + ',' + fileId + ')');
		}
	}
	
	final void a(int i, byte unused, int i1) {
		try {
			++tb;
			this.mb = i;
			this.xb = i1;
			if (this.Kb != null) {
				dh.a(this.anint_nb, this, this.Kb, false);
			} else {
				ee.a(this, true, 255, (byte) 0, -18963, this.mb, this.anint_nb);
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ca.H(" + i + ',' + unused + ',' + i1 + ')');
		}
	}
	
	final int d(int unused) {
		try {
			++eb;
			if (this.Gb) {
				return 100;
			} else if (super.Q != null) {
				return 99;
			} else {
				int percent = wb.a(255, true, this.anint_nb);
				if (~percent <= -101) {
					percent = 99;
				}
				
				return percent;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ca.J(" + unused + ')');
		}
	}
	
	public static void e(int unused) {
		try {
			Mb = null;
			Nb = null;
			pleaseTryUsingADifferentWorld4 = null;
			gb = null;
			qb = null;
			ams = null;
			pleaseTryUsingADifferentWorld7 = null;
			pleaseTryUsingADifferentWorld = null;
			pleaseTryUsingADifferentWorld2 = null;
			rb = null;
			pleaseTryUsingADifferentWorld3 = null;
			kb = null;
			pleaseTryUsingADifferentWorld5 = null;
			pleaseTryUsingADifferentWorld6 = null;
			Eb = null;
			lb = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ca.C(" + unused + ')');
		}
	}
	
	static int a(boolean unused, int i) {
		try {
			++anint_wb;
			i = (i & 1431655765) + ((-1431655765 & i) >>> 1);
			i = ((-858993460 & i) >>> 2) + (i & 858993459);
			i = i - -(i >>> 4) & 252645135;
			i += i >>> 8;
			i += i >>> 16;
			return 0xff & i;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ca.L(" + unused + ',' + i + ')');
		}
	}
	
	static ca a(boolean flag, boolean flag2, byte unused, int id, boolean flag3) {
		try {
			++vb;
			qe qe = null;
			if (rf.G != null) {
				qe = new qe(id, rf.G, a.i[id], 1000000);
			}
			
			return new ca(qe, nb.kc, id, flag3, flag2, flag);
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ca.A(" + flag + ',' + flag2 + ',' + unused + ',' + id + ',' + flag3 + ')');
		}
	}
	
	final void a(boolean flag, byte[] bytes, boolean flag2, int i, byte unused) {
		try {
			++Hb;
			if (flag) {
				if (this.Gb) {
					throw new RuntimeException();
				} else {
					if (this.Kb != null) {
						oe.a(this.anint_nb, this.Kb, 77, bytes);
					}
					
					this.a((byte) 114, bytes);
					this.c((byte) -59);
				}
			} else {
				bytes[bytes.length - 2] = (byte) (super.w[i] >> 8);
				bytes[-1 + bytes.length] = (byte) super.w[i];
				if (this.fb != null) {
					oe.a(i, this.fb, 119, bytes);
					this.Lb[i] = true;
				}
				
				if (flag2) {
					super.Q[i] = nf.a(true, false, bytes);
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ca.I(" + flag + ',' + (bytes != null ? "{...}" : "null") + ',' + flag2 + ',' + i + ',' + unused + ')');
		}
	}
	
	static void a(int i, int i1, int i2, int unused, int i3, int i4, int i5) {
		try {
			if (~(i2 - i1) <= ~gh.R && ~(i1 + i2) >= ~ng.u && ~(-i1 + i5) <= ~dd.a && na.anInt_m >= i5 + i1) {
				rg.a(i2, i5, i1, i3, (byte) -120, i, i4);
			} else {
				ke.a(i1, i5, (byte) 86, i3, i4, i, i2);
			}
			
			++pb;
		} catch (RuntimeException var8) {
			throw bc.a(var8, "ca.K(" + i + ',' + i1 + ',' + i2 + ',' + unused + ',' + i3 + ',' + i4 + ',' + i5 + ')');
		}
	}
	
	private void c(byte unused) {
		try {
			this.Lb = new boolean[super.Q.length];
			int i = 0;
			while (i < this.Lb.length) {
				this.Lb[i] = false;
				++i;
			}
			
			++Db;
			if (this.fb == null) {
				this.Gb = true;
			} else {
				this.jb = -1;
				int i1 = 0;
				for (; ~i1 > ~this.Lb.length; ++i1) {
					if (super.F[i1] > 0) {
						rd.a(this, i1, this.fb, 26523);
						this.jb = i1;
					}
				}
				
				if (~this.jb == 0) {
					this.Gb = true;
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ca.G(" + unused + ')');
		}
	}
	
	final int a(byte unused, int id) {
		//Started 3d library
		try {
			++Jb;
			if (!this.b(id, 0)) {
				return 0;
			} else if (super.Q[id] != null) {
				return 100;
			} else if (this.Lb[id]) {
				return 100;
			} else {
				return wb.a(this.anint_nb, true, id);
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ca.D(" + unused + ',' + id + ')');
		}
	}
	
	private ca(qe qe, qe qe1, int id, boolean flag, boolean flag2, boolean flag3) {
		super(flag, flag2);
		//Prepared visibility map
		try {
			this.fb = qe;
			this.Kb = qe1;
			this.ib = flag3;
			this.anint_nb = id;
			ih.a(this, 255, this.anint_nb);
		} catch (RuntimeException var8) {
			throw bc.a(var8, "ca.<init>(" + (qe != null ? "{...}" : "null") + ',' + (qe1 != null ? "{...}" : "null") + ',' + id + ',' + flag + ',' + flag2 + ',' + flag3 + ')');
		}
	}
	
	static {
		pleaseTryUsingADifferentWorld2 = pleaseTryUsingADifferentWorld;
		pleaseTryUsingADifferentWorld3 = pleaseTryUsingADifferentWorld;
		pleaseTryUsingADifferentWorld4 = pleaseTryUsingADifferentWorld;
		Qb = 0;
		Eb = rf.a(40, "blinken3:");
		pleaseTryUsingADifferentWorld5 = pleaseTryUsingADifferentWorld;
		pleaseTryUsingADifferentWorld6 = pleaseTryUsingADifferentWorld;
		Nb = new ob[500];
		Mb = rf.a(40, "K");
		pleaseTryUsingADifferentWorld7 = pleaseTryUsingADifferentWorld;
		rb = Mb;
		qb = Mb;
		ams = rf.a(40, "ams");
	}
}
