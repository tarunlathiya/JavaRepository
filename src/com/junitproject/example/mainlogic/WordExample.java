package com.junitproject.example.mainlogic;

import java.util.StringTokenizer;

public class WordExample
{
	// returns the reverse words

		public String revWord(String str)
		{
			StringBuilder result = new StringBuilder();
			StringTokenizer token = new StringTokenizer(str," ");

			while (token.hasMoreTokens())
			{
				StringBuilder sb = new StringBuilder();
				sb.append(token.nextToken());

				result.append(sb);
				result.append(" ");
			}
			
			result.reverse();

			return result.toString();

		}
}
