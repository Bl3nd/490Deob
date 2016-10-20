final class bf extends af {
	
	static ob S = rf.a(40, "Starte 3D)2Softwarebibliothek");
	static ob T = rf.a(40, "Ausw-=hlen");
	static int U;
	private int[] V;
	static int W = 0;
	static ob p11_full = rf.a(40, "p11_full");
	private int Y = 2048;
	static int Z;
	static int ab = 0;
	static int bb;
	private int cb = 0;
	static int db;
	static int eb;
	static int[] fb = new int[128];
	private int gb = 10;
	static int hb;
	static int ib;
	static int jb;
	private int[] kb;
	
	private void i(int unused) {
		int dummy = client.anInt_wb;
		
		try {
			++db;
			this.kb = new int[1 + this.gb];
			this.V = new int[1 + this.gb];
			int i = 0;
			int i1 = 4096 / this.gb;
			int i2 = this.Y * i1 >> 12;
			int i3 = 0;
			while (i3 < this.gb) {
				this.kb[i3] = i;
				this.V[i3] = i - -i2;
				i += i1;
				++i3;
			}
			
			this.kb[this.gb] = 4096;
			this.V[this.gb] = this.V[0] + 4096;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "bf.C(" + unused + ')');
		}
	}
	
	final void a(int input, int unused, og og) {
		int dummy = client.anInt_wb;
		
		try {
			label37:
			{
				label35:
				{
					if (input != 0) {
						if (input == 1) {
							break label35;
						} else if (input != 2) {
							break label37;
						}
					}
					
					this.gb = og.readUnsignedByte(255);
				}
				
				this.Y = og.readShort(83);
				this.cb = og.readUnsignedByte(255);
			}
			
			++ib;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "bf.B(" + input + ',' + unused + ',' + (og != null ? "{...}" : "null") + ')');
		}
	}
	
	static void j(int unused) {
		int dummy = client.anInt_wb;
		
		try {
			int i = ia.Y.b(b.chooseOption2);
			int i1 = 0;
			int i2;
			/*if (dummy != 0) {
				i2 = ia.Y.b(ee.a(i1, (byte) 8));
				if (i < i2) {
					i = i2;
				}
				
				++i1;
			}*/
			
			for (; ~si.S < ~i1; ++i1) {
				i2 = ia.Y.b(ee.a(i1, (byte) 8));
				if (i < i2) {
					i = i2;
				}
			}
			
			le.X = true;
			i2 = si.S * 15 + 21;
			++bb;
			hi.k = 22 + si.S * 15;
			i += 8;
			int i3 = tf.m;
			ud.Zb = i;
			int i4 = -(i / 2) + ia.eb;
			if (765 < i + i4) {
				i4 = -i + 765;
			}
			
			if (~i4 > -1) {
				i4 = 0;
			}
			
			le.anInt_fb = i4;
			if (i2 + i3 > 503) {
				i3 = -i2 + 503;
			}
			
			if (~i3 > -1) {
				i3 = 0;
			}
			
			th.bb = i3;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "bf.D(" + unused + ')');
		}
	}
	
	static int c(int unused, int value) {
		try {
			++eb;
			
			return 0xff & value;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "bf.A(" + unused + ',' + value + ')');
		}
	}
	
	public bf() {
		super(0, true);
	}
	
	final int[] a(byte unused, int i) {
		int dummy = client.anInt_wb;
		
		try {
			if (unused <= 13) {
				c(36, -15);
			}
			
			int[] ints = super.nd_v.a(i, 12);
			if (super.nd_v.n) {
				int i1 = rh.r[i];
				int i2;
				if (this.cb != 0) {
					int i3 = 0;
					if (/*dummy != 0 || */lh.eb > i3) {
						do {
							int i4;
							label82:
							{
								int i5;
								label80:
								{
									i2 = 0;
									i5 = bd.J[i3];
									i4 = this.cb;
									if (i4 != 1) {
										if (i4 == 2) {
											break label80;
										} else if (i4 != 3) {
											break label82;
										}
									}
									
									i2 = i5;
									if (dummy == 0) {
										break label82;
									}
								}
								
								i2 = 2048 - -(-4096 + i1 + i5 >> 1);
								if (dummy == 0) {
									break label82;
								}
								
								i2 = (i5 + -i1 >> 1) + 2048;
							}
							
							short s = 0;
							i4 = 0;
							if (/*dummy != 0 || */this.gb > i4) {
								do {
									if (i2 >= this.kb[i4]) {
										if (~i2 > ~this.kb[i4 + 1]) {
											if (this.V[i4] <= i2) {
												break;
											}
											
											s = 4096;
											if (dummy == 0) {
												break;
											}
											
											++i4;
										} else {
											++i4;
										}
									} else {
										++i4;
									}
								} while (this.gb > i4);
							}
							
							ints[i3] = s;
							++i3;
						} while (lh.eb > i3);
					}
				} else {
					short s = 0;
					i2 = 0;
					if (/*dummy != 0 || */this.gb > i2) {
						do {
							if (i1 >= this.kb[i2] && ~i1 > ~this.kb[i2 - -1]) {
								if (~i1 <= ~this.V[i2]) {
									break;
								}
								
								s = 4096;
								if (dummy == 0) {
									break;
								}
							}
							
							++i2;
						} while (this.gb > i2);
					}
					
					p.a(ints, 0, lh.eb, s);
				}
			}
			
			++Z;
			return ints;
		} catch (RuntimeException var11) {
			throw bc.a(var11, "bf.F(" + unused + ',' + i + ')');
		}
	}
	
	public static void k(int unused) {
		try {
			p11_full = null;
			T = null;
			S = null;
			fb = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "bf.E(" + unused + ')');
		}
	}
	
	final void f(int unused) {
		try {
			this.i(4096);
			if (unused != 1) {
				this.a((byte) -77, -83);
			}
			
			++jb;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "bf.L(" + unused + ')');
		}
	}
}
