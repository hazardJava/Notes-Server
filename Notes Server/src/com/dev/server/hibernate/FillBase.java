package com.dev.server.hibernate;

import org.hibernate.Session;

import com.dev.note.Note;

public class FillBase {

	private Session session;

	private String[] texts = {
			"temp text",
			"Mr. Bennet replied that he had not. IT is a truth universally acknowledged, that a single man in possession of a good fortune must be in want of a wife. However little known the feelings or views of such a man may be on his first entering a neighbourhood, this truth is so well fixed in the minds of the surrounding families, that he is considered as the rightful property of some one or other of their daughters.",
			"Why, my dear, you must know, Mrs. Long says that Netherfield is taken by a young man of large fortune from the north of England IT is a truth universally acknowledged, that a single man in possession of a good fortune must be in want of a wife. However little known the feelings or views of such a man may be on his first entering a neighbourhood, this truth is so well fixed in the minds of the surrounding families, that he is considered as the rightful property of some one or other of their daughters.",
			"that he came down on Monday in a chaise and four to see the place, and was so much delighted with it that he agreed with Mr. Morris immediately",
			"that he is to take possession before Michaelmas, and some of his servants are to be in the house by the end of next week",
			"This novel is just endlessly romantic. It's certainly my favorite of her works",
			"todo something",
			"a",
			"special",
			"now",
			"Why, my dear, you must know, Mrs. Long says that Netherfield is taken by a young man of large fortune from the north of England",
			"that he came down on Monday in a chaise and four to see the place, and was so much delighted with it that he agreed with Mr. Morris immediately",
			"that he is to take possession before Michaelmas, and some of his servants are to be in the house by the end of next week",
			"This novel is just endlessly romantic. It's certainly my favorite of her works",
			"todo something",
			"a",
			"special",
			"now",
			"IT is a truth universally acknowledged, that a single man in possession of a good fortune must be in want of a wife. However little known the feelings or views of such a man may be on his first entering a neighbourhood, this truth is so well fixed in the minds of the surrounding families, that he is considered as the rightful property of some one or other of their daughters.",
			"Mr. Bennet replied that he had not.",
			"Why, my dear, you must know, Mrs. Long says that Netherfield is taken by a young man of large fortune from the north of England",
			"that he came down on Monday in a chaise and four to see the place, and was so much delighted with it that he agreed with Mr. Morris immediately",
			"that he is to take possession before Michaelmas, and some of his servants are to be in the house by the end of next week",
			"This novel is just endlessly romantic. It's certainly my favorite of her works",
			"todo something",
			"a",
			"special",
			"now",
			"Why, my dear, you must know, Mrs. Long says that Netherfield is taken by a young man of large fortune from the north of England",
			"that he came down on Monday in a chaise and four to see the place, and was so much delighted with it that he agreed with Mr. Morris immediately",
			"that he is to take possession before Michaelmas, and some of his servants are to be in the house by the end of next week",
			"This novel is just endlessly romantic. It's certainly my favorite of her works",
			"todo something",
			"a",
			"special",
			"now",
			"IT is a truth universally acknowledged, that a single man in possession of a good fortune must be in want of a wife. However little known the feelings or views of such a man may be on his first entering a neighbourhood, this truth is so well fixed in the minds of the surrounding families, that he is considered as the rightful property of some one or other of their daughters.",
			"Mr. Bennet replied that he had not.",
			"Why, my dear, you must know, Mrs. Long says that Netherfield is taken by a young man of large fortune from the north of England",
			"that he came down on Monday in a chaise and four to see the place, and was so much delighted with it that he agreed with Mr. Morris immediately",
			"that he is to take possession before Michaelmas, and some of his servants are to be in the house by the end of next week",
			"This novel is just endlessly romantic. It's certainly my favorite of her works",
			"todo something",
			"a",
			"special",
			"now",
			"Why, my dear, you must know, Mrs. Long says that Netherfield is taken by a young man of large fortune from the north of England",
			"that he came down on Monday in a chaise and four to see the place, and was so much delighted with it that he agreed with Mr. Morris immediately",
			"that he is to take possession before Michaelmas, and some of his servants are to be in the house by the end of next week",
			"This novel is just endlessly romantic. It's certainly my favorite of her works",
			"todo something",
			"a",
			"special",
			"now",
			"IT is a truth universally acknowledged, that a single man in possession of a good fortune must be in want of a wife. However little known the feelings or views of such a man may be on his first entering a neighbourhood, this truth is so well fixed in the minds of the surrounding families, that he is considered as the rightful property of some one or other of their daughters.",
			"Mr. Bennet replied that he had not.",
			"Why, my dear, you must know, Mrs. Long says that Netherfield is taken by a young man of large fortune from the north of England",
			"that he came down on Monday in a chaise and four to see the place, and was so much delighted with it that he agreed with Mr. Morris immediately",
			"that he is to take possession before Michaelmas, and some of his servants are to be in the house by the end of next week",
			"This novel is just endlessly romantic. It's certainly my favorite of her works",
			"todo something",
			"a",
			"special",
			"now",
			"Why, my dear, you must know, Mrs. Long says that Netherfield is taken by a young man of large fortune from the north of England",
			"that he came down on Monday in a chaise and four to see the place, and was so much delighted with it that he agreed with Mr. Morris immediately",
			"that he is to take possession before Michaelmas, and some of his servants are to be in the house by the end of next week",
			"This novel is just endlessly romantic. It's certainly my favorite of her works", "todo something", "a",
			"special", "now" };

	public static void main(String[] args) {
		FillBase mgr = new FillBase();
		mgr.createAndStoreNote();

	}

	private void createAndStoreNote() {
		session = HibernateUtil.buildSessionFactory().openSession();
		session.beginTransaction();
		for (int i = 0; i < texts.length; i++) {
			Note theNote = new Note();
			theNote.setChanged(false);
			theNote.setDeleted(false);
			theNote.setText(texts[i]);
			session.save(theNote);
		}

		session.getTransaction().commit();
		session.close();
	}
}