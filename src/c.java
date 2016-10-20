import java.io.IOException;

final class c extends af {
	
	static int R;
	static int S = 0;
	static int T;
	static ob U = rf.a(40, "Gegenstand f-Ur Mitglieder");
	static int V;
	static int W;
	static int X;
	static wd Y;
	private int Z = 0;
	private int ab = 4096;
	static int bb;
	static ob hint_headicons = rf.a(40, "hint_headicons");
	static ob loadedConfig2;
	private static ob loadedConfig = rf.a(40, "Loaded config");
	
	final void a(int input, int unused, og og) {
		try {
			++R;
			if (input != 0) {
				if (input == 1) {
					this.ab = og.readShort(46);
					return;
				} else if (input != 2) {
					return;
				}
				
				if (client.anInt_wb == 0) {
					super.u = og.readUnsignedByte(255) == 1;
				}
			} else {
				this.Z = og.readShort(38);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "c.B(" + input + ',' + unused + ',' + (og != null ? "{...}" : "null") + ')');
		}
	}
	
	final int[] a(byte unused, int i) {
		int dummy = client.anInt_wb;
		
		try {
			++X;
			if (unused <= 13) {
				loadedConfig2 = null;
			}
			
			int[] ints = super.nd_v.a(i, 12);
			if (super.nd_v.n) {
				int[] ints1 = this.c(i, 0, 87);
				int i1 = 0;
				if (/*dummy != 0 || */i1 < lh.eb) {
					do {
						int i2 = ints1[i1];
						if (i2 >= this.Z) {
							if (i2 <= this.ab) {
								ints[i1] = i2;
								if (dummy == 0) {
									++i1;
									continue;
								}
							}
							
							ints[i1] = this.ab;
							if (dummy != 0) {
								ints[i1] = this.Z;
								++i1;
							} else {
								++i1;
							}
						} else {
							ints[i1] = this.Z;
							++i1;
						}
					} while (i1 < lh.eb);
				}
			}
			
			return ints;
		} catch (RuntimeException var8) {
			throw bc.a(var8, "c.F(" + unused + ',' + i + ')');
		}
	}
	
	static void a(ob ob, ob ob1, ob ob2, byte unused) {
		try {
			kf.i = ob2;
			kf.ob_d = ob1;
			kf.j = ob;
			++bb;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "c.C(" + (ob != null ? "{...}" : "null") + ',' + (ob1 != null ? "{...}" : "null") + ',' + (ob2 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	static void a(ph ph, boolean flag, byte unused) {
		int dummy = client.anInt_wb;
		
		try {
			++T;
			if (rg.z != null) {
				try {
					rg.z.b(-2);
				} catch (Exception e) {
					e.printStackTrace();
				}
				rg.z = null;
			}
			
			rg.z = ph;
			qa.b(flag, -8496);
			wb.R.pointer = 0;
			v.Cb = null;
			ff.Z = null;
			ga.j = 0;
			
			v v;
			do {
				v = (v) pe.E.b((byte) 117);
				if (v == null) {
					break;
				}
				
				qe.a.a(v, v.clientScriptId, true);
				++gh.hb;
				--rg.anint_s;
			} while (dummy == 0);
			
			do {
				v = (v) rh.m.b((byte) 117);
				if (v == null) {
					break;
				}
				
				mg.a.a(v, -64);
				uc.ib.a(v, v.clientScriptId, true);
				++jd.b;
				--pb.a;
			} while (dummy == 0);
			
			if (~tb.aByte_h != -1) {
				try {
					og og = new og(4);
					og.writeByte(125, 4);
					og.writeByte(102, tb.aByte_h);
					og.d(26894, 0);
					rg.z.a(39, og.buffer, 4, 0);
				} catch (IOException e) {
					e.printStackTrace();
					try {
						rg.z.b(-2);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
					rg.z = null;
					++dg.nc;
				}
			}
			
			hh.M = 0;
			ri.aLong_h = a.a((byte) -75);
		} catch (RuntimeException var8) {
			throw bc.a(var8, "c.E(" + (ph != null ? "{...}" : "null") + ',' + flag + ',' + unused + ')');
		}
	}
	
	final int[][] b(int i, byte unused) {
		int dummy = client.anInt_wb;
		
		try {
			++V;
			int[][] ints = super.ve_s.a(i, (byte) 45);
			if (super.ve_s.u) {
				int[][] ints1 = this.b(i, 66, 0);
				int[] ints2 = ints1[1];
				int[] ints3 = ints1[2];
				int[] ints4 = ints1[0];
				int[] ints5 = ints[0];
				int[] ints6 = ints[2];
				int[] ints7 = ints[1];
				int i1 = 0;
				if (/*dummy != 0 || */~i1 > ~lh.eb) {
					do {
						int i2 = ints4[i1];
						int i3 = ints2[i1];
						int i4 = ints3[i1];
						if (i2 >= this.Z) {
							if (~i2 >= ~this.ab) {
								ints5[i1] = i2;
								if (dummy != 0) {
									ints5[i1] = this.ab;
									if (dummy != 0) {
										ints5[i1] = this.Z;
									}
								}
							} else {
								ints5[i1] = this.ab;
								if (dummy != 0) {
									ints5[i1] = this.Z;
								}
							}
						} else {
							ints5[i1] = this.Z;
						}
						
						if (this.Z > i3) {
							ints7[i1] = this.Z;
						}
						
						if (i3 <= this.ab) {
							ints7[i1] = i3;
							if (dummy != 0) {
								ints7[i1] = this.ab;
							}
						} else {
							ints7[i1] = this.ab;
						}
						
						if (i4 >= this.Z) {
							if (this.ab >= i4) {
								ints6[i1] = i4;
								if (dummy != 0) {
									ints6[i1] = this.ab;
									if (dummy != 0) {
										ints6[i1] = this.Z;
										++i1;
									} else {
										++i1;
									}
								} else {
									++i1;
								}
							} else {
								ints6[i1] = this.ab;
								if (dummy != 0) {
									ints6[i1] = this.Z;
									++i1;
								} else {
									++i1;
								}
							}
						} else {
							ints6[i1] = this.Z;
							++i1;
						}
					} while (~i1 > ~lh.eb);
				}
			}
			
			return ints;
		} catch (RuntimeException var17) {
			throw bc.a(var17, "c.G(" + i + ',' + unused + ')');
		}
	}
	
	static boolean a(int i, int i1, int i2, int i3, aa aa, int i4, long l, int i5, int i6, int i7, int i8) {
		return aa == null || jf.a(i, i5, i6, i7 - i5 + 1, i8 - i6 + 1, i1, i2, i3, aa, i4, true, l);
	}
	
	public static void b(byte unused) {
		try {
			Y = null;
			hint_headicons = null;
			loadedConfig = null;
			loadedConfig2 = null;
			U = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "c.A(" + unused + ')');
		}
	}
	
	public c() {
		super(1, false);
	}
	
	static {
		loadedConfig2 = loadedConfig;
	}
}
