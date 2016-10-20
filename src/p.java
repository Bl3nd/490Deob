final class p {
	
	static void arrayCopy(byte[] src, int srcPointer, byte[] dest, int destPointer, int pos) {
		if (src == dest) {
			if (srcPointer == destPointer) {
				return;
			}
			
			if (destPointer > srcPointer && destPointer < srcPointer + pos) {
				--pos;
				srcPointer += pos;
				destPointer += pos;
				pos = srcPointer - pos;
				
				for (pos += 7; srcPointer >= pos; dest[destPointer--] = src[srcPointer--]) {
					dest[destPointer--] = src[srcPointer--];
					dest[destPointer--] = src[srcPointer--];
					dest[destPointer--] = src[srcPointer--];
					dest[destPointer--] = src[srcPointer--];
					dest[destPointer--] = src[srcPointer--];
					dest[destPointer--] = src[srcPointer--];
					dest[destPointer--] = src[srcPointer--];
				}
				
				for (pos -= 7; srcPointer >= pos; dest[destPointer--] = src[srcPointer--]) {
					;
				}
				
				return;
			}
		}
		
		pos += srcPointer;
		
		for (pos -= 7; srcPointer < pos; dest[destPointer++] = src[srcPointer++]) {
			dest[destPointer++] = src[srcPointer++];
			dest[destPointer++] = src[srcPointer++];
			dest[destPointer++] = src[srcPointer++];
			dest[destPointer++] = src[srcPointer++];
			dest[destPointer++] = src[srcPointer++];
			dest[destPointer++] = src[srcPointer++];
			dest[destPointer++] = src[srcPointer++];
		}
		
		for (pos += 7; srcPointer < pos; dest[destPointer++] = src[srcPointer++]) {
			;
		}
		
	}
	
	static void a(int[] var0, int var1, int var2, int var3) {
		for (var2 = var1 + var2 - 7; var1 < var2; var0[var1++] = var3) {
			var0[var1++] = var3;
			var0[var1++] = var3;
			var0[var1++] = var3;
			var0[var1++] = var3;
			var0[var1++] = var3;
			var0[var1++] = var3;
			var0[var1++] = var3;
		}
		
		for (var2 += 7; var1 < var2; var0[var1++] = var3) {
			;
		}
		
	}
	
	static void a(int[] var0, int var1, int var2) {
		for (var2 = var1 + var2 - 7; var1 < var2; var0[var1++] = 0) {
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
		}
		
		for (var2 += 7; var1 < var2; var0[var1++] = 0) {
			;
		}
		
	}
	
	static void a(int[] var0, int var1, int[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}
			
			if (var3 > var1 && var3 < var1 + var4) {
				--var4;
				var1 += var4;
				var3 += var4;
				var4 = var1 - var4;
				
				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}
				
				for (var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					;
				}
				
				return;
			}
		}
		
		var4 += var1;
		
		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}
		
		for (var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) {
			;
		}
		
	}
}
